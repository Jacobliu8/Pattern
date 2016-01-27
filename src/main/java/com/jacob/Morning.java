package com.jacob;

/**
 * Created by LIUJA8 on 1/22/2016.
 */
class Morning extends Period {
  public String invoke(int hour) {
    if (hour < 12) {
      return "morning";
    } else {
      return new Noon().invoke(hour);
    }
  }
}
