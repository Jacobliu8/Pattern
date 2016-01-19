package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class MulOperator extends Operator {

  public MulOperator(String numberA, String numberB) {
    super(numberA, numberB);
  }

  @Override
  public double doCalculate() {
    return Double.valueOf(getNumberA()) * Double.valueOf(getNumberB());
  }
}
