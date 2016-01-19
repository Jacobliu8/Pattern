package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public abstract class Operator {

  private String numberA;
  private String numberB;

  public Operator(String numberA, String numberB) {
    this.numberA = numberA;
    this.numberB = numberB;
  }

  public String getNumberA() {
    return numberA;
  }

  public void setNumberA(String numberA) {
    this.numberA = numberA;
  }

  public String getNumberB() {
    return numberB;
  }

  public void setNumberB(String numberB) {
    this.numberB = numberB;
  }

  public abstract double doCalculate();

}
