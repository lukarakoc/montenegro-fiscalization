package com.montenegro.fiscal.service;

import com.montenegro.fiscal.config.FiscalizationProperties;
import com.montenegro.fiscal.exception.XmlSignatureException;
import com.montenegro.fiscal.util.KeyStoreLoader;
import jakarta.annotation.PostConstruct;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.xml.crypto.MarshalException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collections;

/**
 * Service responsible for digitally signing XML documents using XML Digital Signature. This service
 * initializes the XML signature factory and loads the private key and certificate from the
 * configured keystore to be used for signing documents.
 */
@Component
@RequiredArgsConstructor
public class XmlSignatureService {

  private final FiscalizationProperties properties;
  private XMLSignatureFactory xmlSigFactory;
  private PrivateKey privateKey;
  private X509Certificate certificate;

  /**
   * Initializes the XML signature factory and loads the private key and certificate. This method is
   * automatically called after the bean is constructed.
   */
  @PostConstruct
  public void init() {
    this.xmlSigFactory = XMLSignatureFactory.getInstance("DOM");
    this.privateKey = KeyStoreLoader.getPrivateKey(properties);
    this.certificate = KeyStoreLoader.getCertificate(properties);
  }

  /**
   * Signs an XML document using XML Digital Signature. The method applies an enveloped signature to
   * the document using SHA-256 for digesting and RSA-SHA256 for signing. The signature references
   * the element with Id="Request".
   *
   * @param document The XML document to be signed
   * @return The signed XML document
   * @throws XmlSignatureException If an error occurs during the signing process
   */
  public Document signDocument(Document document) {
    document.getDocumentElement().setIdAttribute("Id", true);
    try {
      var transformList = new ArrayList<Transform>();
      transformList.add(
          xmlSigFactory.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null));
      transformList.add(xmlSigFactory.newTransform(CanonicalizationMethod.EXCLUSIVE,
          (C14NMethodParameterSpec) null));

      var ref = xmlSigFactory.newReference(
          "#Request",
          xmlSigFactory.newDigestMethod(DigestMethod.SHA256, null),
          transformList,
          null,
          null);

      var signedInfo = xmlSigFactory.newSignedInfo(
          xmlSigFactory.newCanonicalizationMethod(
              CanonicalizationMethod.EXCLUSIVE, (C14NMethodParameterSpec) null
          ),
          xmlSigFactory.newSignatureMethod(SignatureMethod.RSA_SHA256, null),
          Collections.singletonList(ref)
      );

      var kif = xmlSigFactory.getKeyInfoFactory();
      var x509Data = kif.newX509Data(Collections.singletonList(certificate));
      var keyInfo = kif.newKeyInfo(Collections.singletonList(x509Data));

      var signContext = new DOMSignContext(privateKey, document.getDocumentElement());

      var signature = xmlSigFactory.newXMLSignature(signedInfo, keyInfo);
      signature.sign(signContext);

      return document;
    } catch (MarshalException | InvalidAlgorithmParameterException | NoSuchAlgorithmException |
             XMLSignatureException e) {
      throw new XmlSignatureException("An error occurred while signing XML document", e);
    }

  }
}
