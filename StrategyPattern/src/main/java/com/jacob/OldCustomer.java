package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class OldCustomer extends Customer {
  double calculatePrice(double goodPrice) {
    System.out.println("5% discount");
    return goodPrice * 0.95;
  }
}
