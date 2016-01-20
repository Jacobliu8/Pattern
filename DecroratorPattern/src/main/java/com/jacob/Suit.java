package com.jacob;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class Suit extends Finery {
  public Suit(String name) {
    super(name);
  }

  public Suit() {

  }

  @Override
  public String show() {
    return person.dressed += "Suit ";
  }
}
