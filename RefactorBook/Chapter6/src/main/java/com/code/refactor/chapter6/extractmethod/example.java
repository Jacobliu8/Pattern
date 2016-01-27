package com.code.refactor.chapter6.extractmethod;

/**
 * Created by LIUJA8 on 1/27/2016.
 */
public class Example {
  private String name;
  private String amount;

  /*
  * use the key Alt + Ctrl + M
  * */
  void printOwing() {
    printBanner();
    printDetail();
  }

  private void printDetail() {
    System.out.println("name : " + name);
    System.out.println("amount : " + amount);
  }

  private void printBanner() {
  }
}
