package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class NoonState extends WorkState {
  @Override
  public String writeProgram(ProgramWork work) {
    if (work.getWorkTime() < 14) {
      return "hungry and tired, have a rest";
    } else {
      work.setState(new AfterNoonState());
      return work.getWorkState(work);
    }
  }
}
