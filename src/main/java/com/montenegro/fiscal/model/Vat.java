package com.montenegro.fiscal.model;

import com.montenegro.fiscal.soap.ExemptFromVATSType;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vat {

  private BigDecimal vatPercentage;
  private ExemptFromVATSType vatExemptionReason;
}
