package com.jacob;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class BigTrouser extends Finery {
  public BigTrouser(String name) {
    super(name);
  }

  public BigTrouser() {
    super();
  }

  @Override
  public String show() {
    return person.dressed += "BigTrouser ";
  }
}
