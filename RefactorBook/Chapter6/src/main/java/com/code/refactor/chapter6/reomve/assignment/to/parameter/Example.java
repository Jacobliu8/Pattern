package com.code.refactor.chapter6.reomve.assignment.to.parameter;

/**
 * Created by LIUJA8 on 1/27/2016.
 */
public class Example {
  int discount(final int inputVal, int quantity, int yearToDate) {
    int result = inputVal;
    if (inputVal > 50)
      result -= 2;
    if (quantity > 100)
      result -= 1;
    if (yearToDate > 10000)
      result -= 4;
    return result;
  }
}
