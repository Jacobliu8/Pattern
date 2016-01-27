package com.jacob;

/**
 * Created by LIUJA8 on 1/22/2016.
 */
public class TimeJudge {
  private Period peroid;

  public TimeJudge() {
    this.peroid = new Morning();
  }

  public String getTimeBelongsPeriod(int hour) {
    return peroid.invoke(hour);
  }

}
