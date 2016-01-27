package com.code.refactor.chapter6.replace.method.with.method.object;

/**
 * Created by LIUJA8 on 1/27/2016.
 */
public class Gamma {
  private final Example example;
  private int inputVal;
  private int quantity;
  private int yearToDate;
  private int importantVal1;
  private int importantVal2;
  private int importantVal3;

  public Gamma(Example example, int inputVal, int quantity, int yearToDate) {
    this.example = example;
    this.inputVal = inputVal;
    this.quantity = quantity;
    this.yearToDate = yearToDate;
  }

  int discount() {
    int importantVal1 = (inputVal * quantity) + example.delta();
    int importantVal2 = (inputVal * yearToDate) + 100;
    importantThing();
    int importantVal3 = importantVal2 * 7;
    return importantVal3 - 2 * importantVal1;
  }

  private void importantThing() {
    if (yearToDate - importantVal1 > 100) {
      importantVal2 = -20;
    }
  }
}
