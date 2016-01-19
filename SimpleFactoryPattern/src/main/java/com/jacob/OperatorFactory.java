package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class OperatorFactory {
  private static String ADD = "+";
   private static String SUBTRACT = "-";
  private static String MULTIPLY = "*";
  private static String DIVIDE = "/";

  public static Operator createOperator(String operate, String numberA, String numberB) {
    if (ADD.equals(operate)) {
      return new AddOperator(numberA, numberB);
    }
    if (SUBTRACT.equals(operate)) {
      return new SubOperator(numberA, numberB);
    }
    if (MULTIPLY.equals(operate)) {
      return new MulOperator(numberA, numberB);

    }
    if (DIVIDE.equals(operate)) {
      return new DivOperator(numberA, numberB);
    }
    return new UnknownOperator(numberA, numberB);
  }
}
