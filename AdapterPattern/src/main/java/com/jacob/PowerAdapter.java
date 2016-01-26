package com.jacob;

/**
 * Created by LIUJA8 on 1/26/2016.
 */
public class PowerAdapter implements DBSocketInterface {
  private GBSocketInterface gbSoket;

  public PowerAdapter(GBSocketInterface gbSoket) {
    this.gbSoket = gbSoket;
  }

  public String powerWithTwoRound() {
    return gbSoket.powerWithThreeFlatS();
  }
}
