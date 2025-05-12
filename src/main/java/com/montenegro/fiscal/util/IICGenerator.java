package com.montenegro.fiscal.util;

import com.montenegro.fiscal.config.FiscalizationProperties;
import com.montenegro.fiscal.model.IicData;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Signature;
import java.time.LocalDateTime;
import java.util.Locale;
import lombok.experimental.UtilityClass;

/**
 * Utility class for generating Internal Invoice Code (IIC/IKOF).
 * This class provides functionality to generate a unique identifier for invoices
 * based on invoice data and digital signature.
 */
@UtilityClass
public class IICGenerator {

  /**
   * Generates an Internal Invoice Code (IIC/IKOF) based on invoice data.
   * The method creates a digital signature using the provided private key and invoice data,
   * then generates an MD5 hash of the signature to create the IIC.
   *
   * @param orderNumber The sequential number of the invoice
   * @param currentDateTime The date and time when the invoice was created
   * @param props The fiscalization properties containing business information
   * @param totalPrice The total price of the invoice
   * @param privateKey The private key used for signing
   * @return An IicData object containing both the signature and the IIC
   * @throws RuntimeException If an error occurs during the generation process
   */
  public static IicData generate(Integer orderNumber,
      LocalDateTime currentDateTime,
      FiscalizationProperties props,
      BigDecimal totalPrice,
      PrivateKey privateKey) {
    try {
      var data = String.join("|",
          props.getPib(),
          DateTimeUtil.toXMLGregorianCalendarNoMiliSeconds(currentDateTime).toString(),
          orderNumber.toString(),
          props.getBusinessUnitCode(),
          props.getTcrCode(),
          props.getSoftCode(),
          totalPrice.toString()
      );

      var rsa = Signature.getInstance("SHA256withRSA");
      rsa.initSign(privateKey);
      rsa.update(data.getBytes(StandardCharsets.US_ASCII));
      var sigBytes = rsa.sign();

      var sigHex = new StringBuilder();
      for (byte b : sigBytes) {
        sigHex.append(String.format(Locale.ROOT, "%02X", b & 0xFF));
      }

      var md5 = MessageDigest.getInstance("MD5");
      var iicBytes = md5.digest(sigBytes);
      var iicHex = new StringBuilder();
      for (var b : iicBytes) {
        iicHex.append(String.format(Locale.ROOT, "%02X", b & 0xFF));
      }

      return new IicData(sigHex.toString(), iicHex.toString());
    } catch (Exception e) {
      throw new RuntimeException("An error occurred while generating IIC (IKOF)", e);
    }
  }
}
