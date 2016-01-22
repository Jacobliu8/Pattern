package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class SuperOverTimeState extends WorkState {
  @Override
  public String stateOnWork(ProgramWork work) {
    return "No, need to sleep or die";
  }
}
