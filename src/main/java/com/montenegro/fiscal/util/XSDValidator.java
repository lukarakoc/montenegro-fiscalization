package com.montenegro.fiscal.util;

import lombok.experimental.UtilityClass;
import org.springframework.core.io.ClassPathResource;
import javax.xml.transform.Source;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

/**
 * Utility class for validating XML documents against XSD schemas. This class provides functionality
 * to ensure that XML documents conform to the specified XML Schema Definition (XSD).
 */
@UtilityClass
public class XSDValidator {

  /**
   * Validates an XML document against an XSD schema. This method loads the XSD schema from the
   * specified path and validates the provided XML source against it.
   *
   * @param xml     The XML source to validate
   * @param xsdPath The classpath location of the XSD schema
   * @throws IllegalArgumentException If the XML is not valid according to the XSD schema
   */
  public static void validate(Source xml, String xsdPath) {
    try {
      SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
      Validator v = sf.newSchema(new ClassPathResource(xsdPath).getURL()).newValidator();
      v.validate(xml);
    } catch (Exception e) {
      throw new IllegalArgumentException("XML is not valid according to XSD: " + e.getMessage(), e);
    }
  }
}
