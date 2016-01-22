package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class AfterNoonState extends WorkState {
  @Override
  public String stateOnWork(ProgramWork work) {
    if (work.getWorkTime() < 18) {
      return "tired bee, keep working";
    } else {
      work.setState(new EveningState());
      return work.getWorkState(work);
    }
  }
}
