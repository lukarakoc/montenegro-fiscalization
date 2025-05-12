package com.montenegro.fiscal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IicData {

  private String signatureHex;
  private String iicHex;

}
