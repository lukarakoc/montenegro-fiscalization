package com.montenegro.fiscal.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
@RequiredArgsConstructor
public class SoapClientConfig {

  private final FiscalizationProperties properties;

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller m = new Jaxb2Marshaller();
    m.setContextPath("com.montenegro.fiscal.soap");
    return m;
  }

  @Bean
  public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
    WebServiceTemplate wst = new WebServiceTemplate(marshaller);
    wst.setDefaultUri(properties.getEndpoint());
    return wst;
  }
}
