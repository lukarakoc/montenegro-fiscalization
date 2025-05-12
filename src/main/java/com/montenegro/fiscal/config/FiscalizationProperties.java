package com.montenegro.fiscal.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "fiscalization")
public class FiscalizationProperties {

  private String idType;
  private String pib;
  private String companyName;
  private String companyAddress;
  private String companyCity;
  private String companyCountry;
  private String tcrCode;
  private String softCode;
  private String businessUnitCode;
  private String operatorCode;
  private String bankAccountNumber;

  private boolean validateXml = false;
  private int timeout = 5000;

  private String endpoint;
  private String verificationUrl;
  private Keystore keystore = new Keystore();

  @Getter
  @Setter
  public static class Keystore {

    private String path;
    private String password;
  }
}
