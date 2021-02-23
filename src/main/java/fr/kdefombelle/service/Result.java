package fr.kdefombelle.service;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="MyResult", description="Pet description")
public class Result {

  @Schema(required = true, description = "The value")
  private int value;

  @Schema(description="Value", maxLength=20)
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

}
