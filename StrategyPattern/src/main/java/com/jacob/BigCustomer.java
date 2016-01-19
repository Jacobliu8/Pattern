package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class BigCustomer extends Customer {
  double calculatePrice(double goodPrice) {
    System.out.println("10% discount");
    return goodPrice * 0.90;
  }
}
