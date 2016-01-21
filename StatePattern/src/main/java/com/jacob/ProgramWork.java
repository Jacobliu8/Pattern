package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class ProgramWork {
  private boolean workFinished = false;
  private WorkState state;
  private int workTime;

  public ProgramWork(int workTime) {
    this.state = new BeforeNoonState();
    this.workTime = workTime;
  }

  public void setWorkFinished(boolean workFinished) {
    this.workFinished = workFinished;
  }

  public boolean isWorkFinished() {
    return workFinished;
  }

  public WorkState getState() {
    return state;
  }

  public void setState(WorkState state) {
    this.state = state;
  }

  public int getWorkTime() {
    return workTime;
  }

  public void setWorkTime(int workTime) {
    this.workTime = workTime;
  }

  public String getWorkState(ProgramWork work) {
    return state.writeProgram(work);
  }
}
