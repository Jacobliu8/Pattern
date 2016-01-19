package com.jacob;

import java.util.Scanner;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class Calculate {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("请输入第一个数字:");
    String numberA = s.nextLine();
    System.out.println("请选择运算符号(+,-,*,/):");
    String operator = s.nextLine();
    System.out.println("请输入第一个数字:");
    String numberB = s.nextLine();
    // Differen point with Strategy pattern
    Operator op = OperatorFactory.createOperator(operator, numberA, numberB);
    System.out.println(op.doCalculate());
  }

}
