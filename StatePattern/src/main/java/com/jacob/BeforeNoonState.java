package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class BeforeNoonState extends WorkState {
  @Override
  public String writeProgram(ProgramWork work) {
    if (work.getWorkTime() < 12) {
      return "happy bee";
    } else {
      work.setState(new NoonState());
      return work.getWorkState(work);
    }
  }
}
