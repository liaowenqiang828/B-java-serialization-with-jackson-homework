package com.thoughtworks.capability.gtb.vo;

import org.codehaus.jackson.annotate.JsonValue;

public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");

  private String code;

  EventType(String code) {
    this.code = code;
  }

  @JsonValue
  public String getCode() {
    return code;
  }
}
