package com.montenegro.fiscal;

import com.montenegro.fiscal.config.FiscalizationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value = {FiscalizationProperties.class})
@SpringBootApplication
public class FiscalApplication {

  public static void main(String[] args) {
    SpringApplication.run(FiscalApplication.class, args);
  }

}
