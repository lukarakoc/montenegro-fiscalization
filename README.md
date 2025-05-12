# Servisa za elektronsku fiskalizaciju - Crna Gora

Java (Spring Boot) biblioteka za integraciju sa fiskalnim servisom Poreske uprave Crne Gore za registraciju i fiskalizaciju računa.

## Pregled

Ova biblioteka pruža jednostavan način za integraciju sa crnogorskim fiskalnim servisom za:
- Registraciju redovnih računa (faktura)
- Storniranje redovnih računa
- Registraciju fiskalnih kasa (ENU)
- Registraciju depozita

Ona upravlja svim složenostima kreiranja SOAP zahtjeva, potpisivanja digitalnim potpisima i obrade odgovora.

## Instalacija

### Maven dependency

Dodajte sljedeći dependency u vaš `pom.xml` fajl:

```xml
<dependency>
    <groupId>com.montenegro</groupId>
    <artifactId>fiscal</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### Gradle dependency

Dodajte sljedeći dependency u vašu `build.gradle` fajl:

```groovy
implementation 'com.montenegro:fiscal:0.0.1-SNAPSHOT'
```

## Konfiguracija

Kreirajte `application.yml` datoteku u `src/main/resources` direktorijumu vašeg projekta sa sljedećim svojstvima:

```yaml
fiscalization:
  id-type: TIN                         # Tip identifikacije (TIN)
  pib: VAŠ_PIB_BROJ                    # Vaš poreski identifikacioni broj
  company-name: IME_VAŠE_KOMPANIJE     # Ime vaše kompanije
  endpoint: https://efitest.tax.gov.me/fs-v1  # Endpoint URL (test ili produkcija)
  keystore:
    path: certs/your-certificate.pfx   # Putanja do vašeg digitalnog sertifikata
    password: LOZINKA_KEYSTORE-a       # Lozinka za vaš digitalni sertifikat
  business-unit-code: KOD_POSLOVNE_JEDINICE  # Kod poslovne jedinice
  tcr-code: KOD_ENU                    # Kod elektronskog naplatnog uređaja
  soft-code: KOD_SOFTVERA              # Kod softvera
  validate-xml: true                   # Da li validirati XML prema šemi
  operator-code: KOD_OPERATERA         # Kod operatera
  bank-account-number: VAŠ_BANKOVNI_RAČUN  # Vaš broj bankovnog računa
  verification-url: https://efitest.tax.gov.me/  # URL za verifikaciju
```

Zamijenite placeholder vrijednosti sa vašim stvarnim informacijama.

## Primjeri Korišćenja

### Registracija Redovnog Računa

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
        // Kreiranje stavki računa
        InvoiceItem item1 = InvoiceItem.builder()
                .code("ITEM001")
                .name("Proizvod 1")
                .quantity(2)
                .unit("kom")
                .unitPrice(new BigDecimal("10.00"))
                .vatRate(new BigDecimal("21.00"))
                .build();

        InvoiceItem item2 = InvoiceItem.builder()
                .code("ITEM002")
                .name("Usluga 1")
                .quantity(1)
                .unit("sat")
                .unitPrice(new BigDecimal("50.00"))
                .vatRate(new BigDecimal("21.00"))
                .build();

        // Kreiranje informacija o kupcu
        BuyerType buyer = new BuyerType();
        buyer.setIDType(IDTypeSType.TIN);
        buyer.setIDNum("87654321");
        buyer.setName("Ime Kupca");
        buyer.setAddress("Adresa Kupca");
        buyer.setTown("Podgorica");
        buyer.setCountry(CountryCodeSType.ME);

        // Kreiranje zahtjeva za račun
        CreateInvoiceRequest request = CreateInvoiceRequest.builder()
                .invoiceType(InvoiceTSType.INVOICE)
                .orderNumber(1)
                .paymentMethod(PaymentMethodTypeSType.ACCOUNT)
                .paymentDeadline(LocalDate.now().plusDays(15))
                .buyer(buyer)
                .items(List.of(item1, item2))
                .note("Izmirite račun u roku od 15 dana.")
                .build();

        // Registracija računa
        return fiscalizationService.registerInvoice(request);
    }
}
```

### Registracija Korektivnog Računa

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
        // Kreiranje stavki računa za korektivni račun
        InvoiceItem item1 = InvoiceItem.builder()
                .code("ITEM001")
                .name("Proizvod 1")
                .quantity(-1)  // Smanjena količina u odnosu na originalni račun
                .unit("kom")
                .unitPrice(new BigDecimal("10.00"))
                .vatRate(new BigDecimal("21.00"))
                .build();

        InvoiceItem item2 = InvoiceItem.builder()
                .code("ITEM002")
                .name("Usluga 1")
                .quantity(-1)
                .unit("sat")
                .unitPrice(new BigDecimal("50.00"))
                .vatRate(new BigDecimal("21.00"))
                .build();
      
        // Referenca na originalni račun
        OriginalInvoice originalInvoice = new OriginalInvoice(
                "0AE36859887129D6363C40F662FF9AE4", // IIC originalnog računa
                LocalDateTime.now().minusDays(5) // datum fiskalizacije originalnog računa
        );

        // Kreiranje informacija o kupcu (treba da odgovara originalnom računu)
        BuyerType buyer = new BuyerType();
        buyer.setIDType(IDTypeSType.TIN);
        buyer.setIDNum("87654321");
        buyer.setName("Ime Kupca");
        buyer.setAddress("Adresa Kupca");
        buyer.setTown("Podgorica");
        buyer.setCountry(CountryCodeSType.ME);

        // Kreiranje zahtjeva za korektivni račun
        CreateInvoiceRequest request = CreateInvoiceRequest.builder()
                .invoiceType(InvoiceTSType.CORRECTIVE)
                .orderNumber(1)
                .paymentMethod(PaymentMethodTypeSType.ACCOUNT)
                .paymentDeadline(LocalDate.now().plusDays(15))
                .buyer(buyer)
                .items(List.of(item1))
                .note("Storniranje za račun ID_ORIGINALNOG_RAČUNA, kupac odustao od kupovine.")
                .original(originalInvoice)  // Referenca na originalni račun
                .build();

        // Registracija korektivnog računa
        return fiscalizationService.registerInvoice(request);
    }
}
```

## Obavezna konfiguracija

Prije korišćenja biblioteke, potrebno je postaviti sljedeće konfiguracije u vaš application.yml fajl:

| Konfiguracija                     | Opis |
|-----------------------------------|------|
| fiscalization.id-type             | Tip identifikacije (obično TIN) |
| fiscalization.pib                 | Vaš poreski identifikacioni broj |
| fiscalization.company-name        | Ime vaše kompanije |
| fiscalization.endpoint            | Endpoint URL za fiskalni servis |
| fiscalization.keystore.path       | Putanja do vašeg digitalnog sertifikata (.pfx datoteka) |
| fiscalization.keystore.password   | Lozinka za vaš digitalni sertifikat |
| fiscalization.business-unit-code  | Kod poslovne jedinice dodijeljen od poreske uprave |
| fiscalization.tcr-code            | Kod elektronskog naplatnog uređaja dodijeljen od poreske uprave |
| fiscalization.soft-code           | Kod softvera dodijeljen od poreske uprave |
| fiscalization.validate-xml        | Da li validirati XML prema šemi |
| fiscalization.operator-code       | Kod operatera dodijeljen od poreske uprave |
| fiscalization.bank-account-number | Vaš broj bankovnog računa |
| fiscalization.verification-url    | URL za verifikaciju računa |

## Licenca

Ovaj projekat je licenciran pod Apache License 2.0 - pogledajte LICENSE fajl za detalje.
