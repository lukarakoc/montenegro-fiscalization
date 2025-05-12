package com.montenegro.fiscal.service;

import com.montenegro.fiscal.model.CashDeposit;
import com.montenegro.fiscal.model.CreateInvoiceRequest;
import com.montenegro.fiscal.model.FiscalizationResult;
import com.montenegro.fiscal.model.TcrInfo;

public interface FiscalizationService {

  FiscalizationResult registerInvoice(CreateInvoiceRequest request);

  String registerTCR(TcrInfo info);

  void registerCashDeposit(CashDeposit deposit);
}
