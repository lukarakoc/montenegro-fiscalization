package com.montenegro.fiscal.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DateTimeUtil {

  private static final DateTimeFormatter ISO8601 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
  private static final ZoneId DEFAULT_ZONE = ZoneId.of("Europe/Podgorica");

  public static String format(LocalDateTime dt) {
    return dt.format(ISO8601);
  }

  public static XMLGregorianCalendar toXMLGregorianCalendar(LocalDateTime currentDateTime) {
    try {
      var df = DatatypeFactory.newInstance();
      var gregorianCalendar = GregorianCalendar.from(
          currentDateTime.atZone(ZoneId.systemDefault()));
      return df.newXMLGregorianCalendar(gregorianCalendar);
    } catch (Exception e) {
      throw new IllegalArgumentException("Neuspješna konverzija datuma u XML format", e);
    }
  }

  public static XMLGregorianCalendar toXMLGregorianCalendarNoMiliSeconds(LocalDateTime ldt) {
    ZoneOffset offset = DEFAULT_ZONE.getRules().getOffset(ldt);
    try {
      DatatypeFactory df = DatatypeFactory.newInstance();
      int tz = offset.getTotalSeconds() / 60;
      return df.newXMLGregorianCalendar(
          ldt.getYear(),
          ldt.getMonthValue(),
          ldt.getDayOfMonth(),
          ldt.getHour(),
          ldt.getMinute(),
          ldt.getSecond(),
          DatatypeConstants.FIELD_UNDEFINED,
          tz
      );
    } catch (Exception e) {
      throw new IllegalArgumentException("Neuspješna konverzija LocalDateTime u XML format", e);
    }
  }

  public static XMLGregorianCalendar parseLocalDateToXMLGregorianCalendar(LocalDate date) {
    try {
      DatatypeFactory df = DatatypeFactory.newInstance();
      return df.newXMLGregorianCalendarDate(
          date.getYear(),
          date.getMonthValue(),
          date.getDayOfMonth(),
          DatatypeConstants.FIELD_UNDEFINED
      );
    } catch (Exception e) {
      throw new IllegalArgumentException("Error parsing LocalDate to XMLGregorianCalendar", e);
    }
  }

  /**
   * Pretvara XMLGregorianCalendar u OffsetDateTime
   */
  public static OffsetDateTime toOffsetDateTime(XMLGregorianCalendar xgc) {
    if (xgc == null) {
      return null;
    }
    return xgc
        .toGregorianCalendar()
        .toZonedDateTime()
        .toOffsetDateTime();
  }
}
