package com.jacob;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by LIUJA8 on 1/22/2016.
 */
public class AdapterTest {
  @Test
  public void DBSocketStandardWorking() {
    DBSocketInterface dbSoket = new DBSocket();
    Hotel hotel = new Hotel(dbSoket);
    Assert.assertEquals(hotel.charge(), "powerWithTwoRound");
  }

  @Test
  public void GBSocketStandardWorkInDBSocket() {
    DBSocketInterface dbSoket = new DBSocket();
    Hotel hotel = new Hotel(dbSoket);
    GBSocketInterface gbSoket = new GBSocket();
    PowerAdapter adapter = new PowerAdapter(gbSoket);
    hotel.setDbSocket(adapter);
    Assert.assertEquals(hotel.charge(), "powerWithThreeFlatS");
  }

}

