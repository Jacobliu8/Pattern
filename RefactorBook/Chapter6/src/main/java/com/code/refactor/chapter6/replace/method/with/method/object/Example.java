package com.code.refactor.chapter6.replace.method.with.method.object;

/**
 * Created by LIUJA8 on 1/27/2016.
 */
public class Example {
  int discount(int inputVal, int quantity, int yearToDate) {
    return new Gamma(this, inputVal, quantity, yearToDate).discount();
  }

  public int delta() {
    return 0;
  }
}
