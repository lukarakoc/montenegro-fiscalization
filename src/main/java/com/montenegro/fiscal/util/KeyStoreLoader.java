package com.montenegro.fiscal.util;

import com.montenegro.fiscal.config.FiscalizationProperties;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

/**
 * Utility class for loading and accessing certificates and private keys from a PKCS#12 keystore.
 * This class provides methods to load a keystore from a specified path and retrieve
 * private keys and certificates needed for digital signing operations.
 */
public class KeyStoreLoader {

  /**
   * Loads a PKCS#12 keystore using parameters from the configuration.
   *
   * @param props The fiscalization properties containing keystore path and password
   * @return The loaded KeyStore object
   * @throws Exception If an error occurs during keystore loading
   */
  private static KeyStore loadKeyStore(FiscalizationProperties props) throws Exception {
    KeyStore ks = KeyStore.getInstance("PKCS12");
    String path = props.getKeystore().getPath();
    try (InputStream is = KeyStoreLoader.class.getClassLoader().getResourceAsStream(path)) {
      if (is == null) {
        throw new IllegalArgumentException("Keystore not found at path: " + path);
      }
      ks.load(is, props.getKeystore().getPassword().toCharArray());
    }
    return ks;
  }

  /**
   * Retrieves the first private key entry from the keystore.
   * This method loads the keystore and searches for the first entry that contains a private key.
   *
   * @param props The fiscalization properties containing keystore path and password
   * @return The private key from the keystore
   * @throws RuntimeException If an error occurs during keystore loading or key retrieval
   * @throws IllegalStateException If no private key is found in the keystore
   */
  public static PrivateKey getPrivateKey(FiscalizationProperties props) {
    try {
      KeyStore ks = loadKeyStore(props);
      Enumeration<String> aliases = ks.aliases();
      while (aliases.hasMoreElements()) {
        String alias = aliases.nextElement();
        if (ks.isKeyEntry(alias)) {
          Key key = ks.getKey(alias, props.getKeystore().getPassword().toCharArray());
          if (key instanceof PrivateKey) {
            return (PrivateKey) key;
          }
        }
      }
      throw new IllegalStateException("No private key found in keystore");
    } catch (Exception e) {
      throw new RuntimeException("Error loading private key from keystore: " + e.getMessage(), e);
    }
  }

  /**
   * Retrieves the certificate corresponding to the first key entry in the keystore.
   * This method first attempts to retrieve the certificate chain and returns the first certificate
   * in the chain (end-entity certificate). If that fails, it falls back to retrieving a single certificate.
   *
   * @param props The fiscalization properties containing keystore path and password
   * @return The X509Certificate from the keystore
   * @throws RuntimeException If an error occurs during keystore loading or certificate retrieval
   * @throws IllegalStateException If no certificate is found in the keystore
   */
  public static X509Certificate getCertificate(FiscalizationProperties props) {
    try {
      KeyStore ks = loadKeyStore(props);
      Enumeration<String> aliases = ks.aliases();
      while (aliases.hasMoreElements()) {
        String alias = aliases.nextElement();
        if (ks.isKeyEntry(alias)) {
          // Try to retrieve the entire certificate chain
          java.security.cert.Certificate[] chain = ks.getCertificateChain(alias);
          if (chain != null && chain.length > 0 && chain[0] instanceof X509Certificate) {
            // The first element in the chain is the end-entity certificate
            return (X509Certificate) chain[0];
          }
          // Otherwise, fallback to the standard getCertificate method
          java.security.cert.Certificate cert = ks.getCertificate(alias);
          if (cert instanceof X509Certificate) {
            return (X509Certificate) cert;
          }
        }
      }
      throw new IllegalStateException("No certificate found in keystore");
    } catch (Exception e) {
      throw new RuntimeException("Error loading certificate from keystore: " + e.getMessage(), e);
    }
  }
}
