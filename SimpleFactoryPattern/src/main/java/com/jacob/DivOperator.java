package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class DivOperator extends Operator {
  public DivOperator(String numberA, String numberB) {
    super(numberA, numberB);
  }

  @Override
  public double doCalculate() {
    return Double.valueOf(getNumberA()) / Double.valueOf(getNumberB());
  }
}
