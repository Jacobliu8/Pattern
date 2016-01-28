package com.jacob;

/**
 * Created by LIUJA8 on 1/28/2016.
 */
public class TodoList {
  private int totalTaskCount;
  private int finishedTaskCount;
  private int newTasks;

  public TodoList() {
    totalTaskCount = newTasks = finishedTaskCount = 0;
  }

  public int getTotalTaskCount() {
    return totalTaskCount;
  }

  public void setTotalTaskCount(int count) {
    totalTaskCount = count;
  }

  public void finishTask(int count) {
    finishedTaskCount = count;
  }

  public void setNewTasks(int newTasks) {
    this.newTasks = newTasks;
  }

  public int getRestTasksCount() {
    return totalTaskCount - finishedTaskCount + newTasks;
  }
}
