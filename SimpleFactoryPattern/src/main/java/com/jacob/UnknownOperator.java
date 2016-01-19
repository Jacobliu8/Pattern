package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class UnknownOperator extends Operator {
  public UnknownOperator(String numberA, String numberB) {
    super(numberA, numberB);
  }

  @Override
  public double doCalculate() {
    return 0;
  }
}
