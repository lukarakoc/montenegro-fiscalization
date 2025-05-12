package com.montenegro.fiscal.model;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FiscalizationResult {

  private String jikr;               // FIC kod iz odgovora
  private String verificationUrl;    // URL za verifikaciju
  private OffsetDateTime timestamp;  // vrijeme iz odgovora
}
