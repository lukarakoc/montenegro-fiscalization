package com.montenegro.fiscal.model;

import java.math.BigDecimal;
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
public class InvoiceItem {

  private String code;
  private String name;
  private int quantity;
  private String unit;
  private BigDecimal unitPrice;
  private BigDecimal vatRate; // 0, 5, 10, 13, 20
  private String vatExemptionReason;
}
