package com.jacob;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
public class PriceClient {
  void getPrice(double goodPrice, String type) {
    Price price = new Price(type);
    System.out.println(price.getPrice(goodPrice));
  }
}
