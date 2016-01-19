package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class NormalCustomer extends Customer {
  double calculatePrice(double goodPrice) {
    System.out.println("no discount");
    return goodPrice;
  }
}
