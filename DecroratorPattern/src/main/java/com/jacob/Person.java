package com.jacob;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class Person {
  private String name;
  protected String dressed = "";

  public Person(String name) {
    this.name = name;
  }

  public Person() {}

  public String show() {
    return dressed + "Dressed " + name;
  }

  public String getDressed() {
    return dressed;
  }

  public void setDressed(String dressed) {
    this.dressed = dressed;
  }
}
