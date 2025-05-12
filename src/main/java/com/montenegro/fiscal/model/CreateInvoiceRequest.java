package com.montenegro.fiscal.model;

import com.montenegro.fiscal.soap.BuyerType;
import com.montenegro.fiscal.soap.InvoiceTSType;
import com.montenegro.fiscal.soap.PaymentMethodTypeSType;
import java.time.LocalDate;
import java.util.List;
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
public class CreateInvoiceRequest {

  private InvoiceTSType invoiceType;
  private Integer orderNumber;
  private PaymentMethodTypeSType paymentMethod;
  private LocalDate paymentDeadline;
  private BuyerType buyer;
  private List<InvoiceItem> items;
  private String note;
  private OriginalInvoice original;

}
