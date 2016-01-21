package com.jacob;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class WorkTest {
  @Test
  public void ShouldBeEnergyWhenBefore12AM() {
    ProgramWork programWork = new ProgramWork();
    assertEquals(programWork.getWorkState(9), "happy bee");
  }

  @Test
  public void shouldBeTiredBetween12AMTo2PM() {
    ProgramWork programWork = new ProgramWork();
    assertEquals(programWork.getWorkState(13), "hungry and tired, have a rest");
  }

  @Test
  public void shouldBeTiredBetween2PMTo18PM() {
    ProgramWork programWork = new ProgramWork();
    assertEquals(programWork.getWorkState(15), "tired bee, keep working");
  }

  @Test
  public void shouldBeSadBetween18AMTo22PM() {
    ProgramWork programWork = new ProgramWork();
    assertEquals(programWork.getWorkState(19), "sad bee, work not finished, keep going");
  }

  @Test
  public void shouldBeOutbreakOver22PM() {
    ProgramWork programWork = new ProgramWork();
    assertEquals(programWork.getWorkState(23), "No, need to sleep or die");
  }

  @Test
  public void shouldBeHomeOver18PM() {
    ProgramWork programWork = new ProgramWork();
    programWork.setWorkFinished(true);
    assertEquals(programWork.getWorkState(23), "work finished, go home freely");
  }

}
