package com.montenegro.fiscal.model;

import com.montenegro.fiscal.soap.InvoiceSType;
import com.montenegro.fiscal.soap.SubseqDelivTypeSType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
public class Invoice {

  private String invNum;
  private int invOrdNum;
  private OffsetDateTime issueDateTime;
  private InvoiceSType type;        // gotovinski, bezgotovinski…
  private boolean isSimplified;
  private String operatorCode;
  private String busiUnitCode;
  private String tcrCode;
  private String softCode;
  private BigDecimal totPrice;
  private BigDecimal totPriceWoVAT;
  private BigDecimal totVATAmt;
  private List<InvoiceItem> items;
  private List<Payment> payMethods;
  private boolean subseq;
  private SubseqDelivTypeSType subseqDelivType;
}
