package com.code.refactor.chapter6.reomve.assignment.to.parameter;

import java.util.Date;

/**
 * Created by LIUJA8 on 1/27/2016.
 */
public class Example2 {

  public static void main(String[] args) {
    Date d1 = new Date("1 Apr 2015");
    nextDateUpdate(d1);
    System.out.println("d1 after nextDay: " + d1);

    Date d2 = new Date("1 Apr 98");
    nextDateReplace(d2);
    System.out.println("d2 after nextDay: " + d2);
  }

  private static void nextDateReplace(Date ary) {
    ary = new Date(ary.getYear(), ary.getMonth(), ary.getDay() + 1);
    System.out.println("arg in nextDay: " + ary);
  }

  private static void nextDateUpdate(Date arg) {
    arg.setDate(arg.getDay() + 1);
    System.out.println("arg in nextDay: " + arg);
  }
}
