package com.jacob;

import java.util.Scanner;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class Calculate {
  private static String ADD = "+";
  private static String SUBTRACT = "-";
  private static String MULTIPLY = "*";
  private static String DIVIDE = "/";

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("请输入第一个数字:");
    String numberA = s.nextLine();
    System.out.println("请选择运算符号(+,-,*,/):");
    String operator = s.nextLine();
    System.out.println("请输入第一个数字:");
    String numberB = s.nextLine();
    if (ADD.equals(operator)) {
      System.out.println(Double.valueOf(numberA) + Double.valueOf(numberB));
      return;
    }
    if (SUBTRACT.equals(operator)) {
      System.out.println(Double.valueOf(numberA) - Double.valueOf(numberB));
      return;
    }
    if (MULTIPLY.equals(operator)) {
      System.out.println(Double.valueOf(numberA) * Double.valueOf(numberB));
      return;
    }
    if (MULTIPLY.equals(operator)) {
      System.out.println(Double.valueOf(numberA) / Double.valueOf(numberB));
      return;
    }
  }
}
