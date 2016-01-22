package com.jacob;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by LIUJA8 on 1/22/2016.
 */
public class AdapterTest {
  @Test
  public void europeSocketStandardNotWorkInChina() {
    Outlet outlet = new Outlet("China");
    Plug plug = new Plug("Europe");
    Assert.assertFalse(outlet.accept(plug));
  }

  @Test
  public void chinaSocketStandardWorkInChina() {
    Outlet outlet = new Outlet("China");
    Plug plug = new Plug("China");
    Assert.assertTrue(outlet.accept(plug));
  }

  @Test
  public void europeSocketStandardAfterAdapterWorkInChina() {
    Outlet outlet = new Outlet("China");
    PowerAdapter adapter = new PowerAdapter("Europe");
    Assert.assertTrue(outlet.accept(adapter));
  }
  // TODO still not really AdapterPattern
}

