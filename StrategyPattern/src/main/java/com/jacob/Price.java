package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class Price {
  private Customer customer = null;

  public Price(String customerType) {
    if (customerType.equals("common")) {
      customer = new NormalCustomer();
    }
    if (customerType.equals("old")) {
      customer = new OldCustomer();
    }
    if (customerType.equals("big")) {
      customer = new BigCustomer();
    }
    customer = new NormalCustomer();
  }

  public double getPrice(double price) {
    return customer.calculatePrice(price);
  }

}
