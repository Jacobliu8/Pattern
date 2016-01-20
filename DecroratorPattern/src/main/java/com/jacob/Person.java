package com.jacob;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class Person {
  private String name;
  private String Dressed = "";

  public Person(String name) {
    this.name = name;
  }

  public void wearTshirt() {
    Dressed += "T-shirt ";
  }

  public void wearBigTrouser() {
    Dressed += "BigTrouser ";
  }

  public void wearSneakers() {
    Dressed += "Sneakers ";
  }

  public void wearSuit() {
    Dressed += "Suit ";
  }

  public void wearTie() {
    Dressed += "Tie ";
  }

  public void wearLeatherShoes() {
    Dressed += "LeatherShoes ";
  }

  public String show() {
    return Dressed + "Dressed " + name;
  }
}
