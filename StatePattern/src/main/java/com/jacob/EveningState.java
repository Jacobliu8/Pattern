package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class EveningState extends WorkState {
  @Override
  public String writeProgram(ProgramWork work) {
    if(work.isWorkFinished()){
      return "work finished, go home freely";
    } else {
      if(work.getWorkTime() < 22){
        work.setState(new OverTimeState());
        return work.getWorkState(work);
      }
      else {
        work.setState(new SuperOverTimeState());
        return work.getWorkState(work);
      }
    }


  }
}
