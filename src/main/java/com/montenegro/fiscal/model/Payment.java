package com.montenegro.fiscal.model;

import com.montenegro.fiscal.soap.PaymentMethodTypeSType;
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
public class Payment {
    private PaymentMethodTypeSType type;
    private BigDecimal amt;
}
