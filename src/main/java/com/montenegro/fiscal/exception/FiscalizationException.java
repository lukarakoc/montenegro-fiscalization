package com.montenegro.fiscal.exception;

public class FiscalizationException extends RuntimeException {

  public FiscalizationException(String msg) {
    super(msg);
  }

  public FiscalizationException(String msg, Throwable cause) {
    super(msg, cause);
  }
}

