package com.jacob;

/**
 * Created by LIUJA8 on 1/22/2016.
 */
public class Outlet {
  private String standard;

  public Outlet(String standard) {
    this.standard = standard;
  }

  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public boolean accept(Plug plug) {
    return standard.equals(plug.getStandard());
  }
}
