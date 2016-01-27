package com.jacob;

/**
 * Created by LIUJA8 on 1/22/2016.
 */
class Noon extends Period {
  public String invoke(int hour) {
    if (hour < 14) {
      return "noon";
    } else {
      return new Afternoon().invoke(hour);
    }
  }
}
