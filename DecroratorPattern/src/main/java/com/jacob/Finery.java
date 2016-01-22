package com.jacob;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class Finery extends Person {

  protected Person person;

  public Finery(String name) {
    super(name);
  }

  public Finery() {
    super();
  }

  public void decorate(Person decoratedPerson) {
    this.person = decoratedPerson;
    show();
  }

  @Override
  public String show() {
    if (person != null) {
      return person.show();
    } else {
      return "ghost streaking!!!";
    }
  }
}
