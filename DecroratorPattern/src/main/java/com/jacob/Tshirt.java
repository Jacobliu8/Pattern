package com.jacob;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class Tshirt extends Finery {
  public Tshirt(String name) {
    super(name);
  }

  public Tshirt() {
    super();
  }

  @Override
  public String show() {
    return person.dressed += "T-shirt ";
  }
}
