# Montenegro Fiscal Service

A Java library for integrating with Montenegro's fiscal service for invoice registration and fiscalization.

## Overview

This library provides a simple way to integrate with Montenegro's fiscal service for:
- Registering regular invoices
- Registering corrective invoices
- Registering Tax Cash Registers (TCR)
- Registering cash deposits

It handles all the complexities of creating SOAP requests, signing them with digital signatures, and processing the responses.

## Installation

### Maven Dependency

Add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.montenegro</groupId>
    <artifactId>fiscal</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### Gradle Dependency

Add the following dependency to your `build.gradle` file:

```groovy
implementation 'com.montenegro:fiscal:0.0.1-SNAPSHOT'
```

## Configuration

Create an `application.yml` file in your project's `src/main/resources` directory with the following properties:

```yaml
fiscalization:
  id-type: TIN                         # Type of identification (TIN)
  pib: YOUR_PIB_NUMBER                 # Your tax identification number
  company-name: YOUR_COMPANY_NAME      # Your company name
  endpoint: https://efitest.tax.gov.me/fs-v1  # Endpoint URL (test or production)
  keystore:
    path: certs/your-certificate.pfx   # Path to your digital certificate
    password: YOUR_KEYSTORE_PASSWORD   # Password for your digital certificate
  business-unit-code: YOUR_BU_CODE     # Business unit code
  tcr-code: YOUR_TCR_CODE              # Tax cash register code
  soft-code: YOUR_SOFT_CODE            # Software code
  validate-xml: true                   # Whether to validate XML against schema
  operator-code: YOUR_OPERATOR_CODE    # Operator code
  bank-account-number: YOUR_BANK_ACCOUNT  # Your bank account number
  verification-url: https://efitest.tax.gov.me/  # URL for verification
```

Replace the placeholder values with your actual information.

## Usage Examples

### Registering a Regular Invoice

```java
import com.montenegro.fiscal.model.CreateInvoiceRequest;
import com.montenegro.fiscal.model.FiscalizationResult;
import com.montenegro.fiscal.model.InvoiceItem;
import com.montenegro.fiscal.service.FiscalizationService;
import com.montenegro.fiscal.soap.BuyerType;
import com.montenegro.fiscal.soap.InvoiceTSType;
import com.montenegro.fiscal.soap.PaymentMethodTypeSType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class InvoiceExample {

    private final FiscalizationService fiscalizationService;

    public InvoiceExample(FiscalizationService fiscalizationService) {
        this.fiscalizationService = fiscalizationService;
    }

    public FiscalizationResult registerRegularInvoice() {
        // Create invoice items
        InvoiceItem item1 = InvoiceItem.builder()
                .code("ITEM001")
                .name("Product 1")
                .quantity(2)
                .unit("pcs")
                .unitPrice(new BigDecimal("10.00"))
                .vatRate(new BigDecimal("21.00"))
                .build();

        InvoiceItem item2 = InvoiceItem.builder()
                .code("ITEM002")
                .name("Service 1")
                .quantity(1)
                .unit("hour")
                .unitPrice(new BigDecimal("50.00"))
                .vatRate(new BigDecimal("21.00"))
                .build();

        // Create buyer information (optional)
        BuyerType buyer = new BuyerType();
        buyer.setName("Customer Name");
        buyer.setAddress("Customer Address");
        buyer.setTown("Podgorica");
        buyer.setCountry(CountryCodeSType.ME);

        // Create invoice request
        CreateInvoiceRequest request = CreateInvoiceRequest.builder()
                .invoiceType(InvoiceTSType.INVOICE)
                .orderNumber(1)
                .paymentMethod(PaymentMethodTypeSType.CARD)
                .paymentDeadline(LocalDate.now().plusDays(15))
                .buyer(buyer)
                .items(List.of(item1, item2))
                .note("Thank you for your business")
                .build();

        // Register invoice
        return fiscalizationService.registerInvoice(request);
    }
}
```

### Registering a Corrective Invoice

```java
import com.montenegro.fiscal.model.CreateInvoiceRequest;
import com.montenegro.fiscal.model.FiscalizationResult;
import com.montenegro.fiscal.model.InvoiceItem;
import com.montenegro.fiscal.model.OriginalInvoice;
import com.montenegro.fiscal.service.FiscalizationService;
import com.montenegro.fiscal.soap.BuyerType;
import com.montenegro.fiscal.soap.InvoiceTSType;
import com.montenegro.fiscal.soap.PaymentMethodTypeSType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class CorrectiveInvoiceExample {

    private final FiscalizationService fiscalizationService;

    public CorrectiveInvoiceExample(FiscalizationService fiscalizationService) {
        this.fiscalizationService = fiscalizationService;
    }

    public FiscalizationResult registerCorrectiveInvoice() {
        // Create invoice items for the corrective invoice
        InvoiceItem item1 = InvoiceItem.builder()
                .code("ITEM001")
                .name("Product 1")
                .quantity(1)  // Reduced quantity from original invoice
                .unit("pcs")
                .unitPrice(new BigDecimal("10.00"))
                .vatRate(new BigDecimal("21.00"))
                .build();

        // Reference to the original invoice
        OriginalInvoice originalInvoice = new OriginalInvoice(
                "ORIGINAL_INVOICE_ID",
                LocalDateTime.now().minusDays(5)
        );

        // Create buyer information (should match original invoice)
        BuyerType buyer = new BuyerType();
        buyer.setName("Customer Name");
        buyer.setAddress("Customer Address");
        buyer.setTown("Podgorica");
        buyer.setCountry(CountryCodeSType.ME);

        // Create corrective invoice request
        CreateInvoiceRequest request = CreateInvoiceRequest.builder()
                .invoiceType(InvoiceTSType.CORRECTIVE)
                .orderNumber(2)
                .paymentMethod(PaymentMethodTypeSType.CARD)
                .paymentDeadline(LocalDate.now().plusDays(15))
                .buyer(buyer)
                .items(List.of(item1))
                .note("Correction for invoice ORIGINAL_INVOICE_ID")
                .original(originalInvoice)  // Reference to original invoice
                .build();

        // Register corrective invoice
        return fiscalizationService.registerInvoice(request);
    }
}
```

## Required Properties

Before using the library, you need to set the following properties in your application.yml file:

| Property | Description |
|----------|-------------|
| fiscalization.id-type | Type of identification (usually TIN) |
| fiscalization.pib | Your tax identification number |
| fiscalization.company-name | Your company name |
| fiscalization.endpoint | Endpoint URL for the fiscal service |
| fiscalization.keystore.path | Path to your digital certificate (.pfx file) |
| fiscalization.keystore.password | Password for your digital certificate |
| fiscalization.business-unit-code | Business unit code assigned by tax authority |
| fiscalization.tcr-code | Tax cash register code assigned by tax authority |
| fiscalization.soft-code | Software code assigned by tax authority |
| fiscalization.validate-xml | Whether to validate XML against schema |
| fiscalization.operator-code | Operator code assigned by tax authority |
| fiscalization.bank-account-number | Your bank account number |
| fiscalization.verification-url | URL for verification of invoices |

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.