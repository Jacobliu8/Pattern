package com.jacob;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class LeatherShoes extends Finery {

  public LeatherShoes(String name) {
    super(name);
  }

  public LeatherShoes() {

  }

  @Override
  public String show() {
    return person.dressed += "LeatherShoes ";
  }
}
