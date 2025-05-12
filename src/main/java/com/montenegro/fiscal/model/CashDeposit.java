package com.montenegro.fiscal.model;

import java.math.BigDecimal;
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
public class CashDeposit {

  public enum Operation {INITIAL, WITHDRAW}

  private BigDecimal cashAmt;
  private OffsetDateTime changeDateTime;
  private Operation operation;
  private String subseqDelivType; // NOINTERNET, SERVICE...
}
