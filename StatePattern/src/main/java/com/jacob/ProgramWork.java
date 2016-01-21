package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class ProgramWork {
  private boolean workFinished = false;

  public void setWorkFinished(boolean workFinished) {
    this.workFinished = workFinished;
  }

  public String getWorkState(int time) {
    if (time < 12) {
      return "happy bee";
    } else if (time >= 12 && time < 14) {
      return "hungry and tired, have a rest";
    } else if (time >= 14 && time < 18) {
      return "tired bee, keep working";
    } else {
      if (!workFinished) {
        if (time >= 18 && time < 22) {
          return "sad bee, work not finished, keep going";
        }
        if (time >= 22) {
          return "No, need to sleep or die";
        }
      } else {
        return "work finished, go home freely";
      }
    }
    return null;
  }
}
