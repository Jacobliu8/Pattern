package com.jacob;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by LIUJA8 on 1/21/2016.
 */


public class TimeTest {
  @Test
  public void _10AMShouldBelongsToMorning() {
    TimeJudge judge = new TimeJudge();
    Assert.assertEquals(judge.getTimeBelongsPeriod(10), "morning");
  }

  @Test
  public void _13PMShouldBelongToNoon() {
    TimeJudge judge = new TimeJudge();
    Assert.assertEquals(judge.getTimeBelongsPeriod(13), "noon");
  }

  @Test
  public void _15PMShouldBelongsToAfterNoon() {
    TimeJudge judge = new TimeJudge();
    Assert.assertEquals(judge.getTimeBelongsPeriod(16), "afternoon");
  }

  @Test
  public void _20PMShouldBelongsToAfterWork() {
    TimeJudge judge = new TimeJudge();
    Assert.assertEquals(judge.getTimeBelongsPeriod(20), "after_work");
  }

}
