package com.jacob;

import cucumber.api.PendingException;
import org.junit.Assert;

import com.jacob.TodoList;

import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

/**
 * Created by LIUJA8 on 1/28/2016.
 */
public class TodoSteps {
  private TodoList todo;

  @假设("^我的任务清单里(\\d+)个任务$")
  public void ihaveSomeTasks(int totalTasks) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    todo = new TodoList();
    todo.setTotalTaskCount(totalTasks);
    Assert.assertEquals(todo.getTotalTaskCount(), totalTasks);
  }

  @当("^我完成(\\d+)件任务之后$")
  public void iFinishSomeTasks(int finishedTasks) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    todo.finishTask(finishedTasks);
  }

  @那么("^我还剩下(\\d+)件完未成的任务$")
  public void iLeftSomeTasks(int leftTasks) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals(todo.getRestTasksCount(), leftTasks);
  }

  @当("^我获得(\\d+)件任务之后$")
  public void igetNewTasks(int getTasks) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    todo.setNewTasks(getTasks);
  }
}
