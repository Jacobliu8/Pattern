package com.jacob;

/**
 * Created by LIUJA8 on 1/22/2016.
 */
class Afternoon extends Period {
  public String invoke(int hour) {
    if (hour < 18) {
      return "afternoon";
    } else {
      return new AfterWork().invoke(hour);
    }
  }
}
