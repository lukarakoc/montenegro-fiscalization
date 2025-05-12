package com.montenegro.fiscal.model;

import java.time.LocalDate;
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
public class TcrInfo {
    private String issuerTin;
    private String busiUnitCode;
    private String tcrIntId;
    private String softCode;
    private String maintainerCode;
    private LocalDate validFrom;
    private LocalDate validTo;
    private String type; // REGULAR, VENDING
}
