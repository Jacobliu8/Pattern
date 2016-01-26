package com.jacob;

/**
 * Created by LIUJA8 on 1/26/2016.
 */
public class Hotel {
  public DBSocketInterface getDbSocket() {
    return dbSocket;
  }

  public void setDbSocket(DBSocketInterface dbSocket) {
    this.dbSocket = dbSocket;
  }

  private DBSocketInterface dbSocket;

  public Hotel(DBSocketInterface dbSoket) {
    this.dbSocket = dbSoket;
  }


  public String charge() {
    return dbSocket.powerWithTwoRound();
  }
}
