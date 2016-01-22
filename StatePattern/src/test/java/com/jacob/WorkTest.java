package com.jacob;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class WorkTest {
  @Test
  public void ShouldBeEnergyWhenBefore12AM() {
    ProgramWork programWork = new ProgramWork(9);
    assertEquals(programWork.getWorkState(programWork), "happy bee");
  }

  @Test
  public void shouldBeTiredBetween12AMTo2PM() {
    ProgramWork programWork = new ProgramWork(13);
    assertEquals(programWork.getWorkState(programWork), "hungry and tired, have a rest");
  }

  @Test
  public void shouldBeTiredBetween2PMTo18PM() {
    ProgramWork programWork = new ProgramWork(15);
    assertEquals(programWork.getWorkState(programWork), "tired bee, keep working");
  }

  @Test
  public void shouldBeSadBetween18AMTo22PM() {
    ProgramWork programWork = new ProgramWork(19);
    assertEquals(programWork.getWorkState(programWork), "sad bee, work not finished, keep going");
  }

  @Test
  public void shouldBeOutbreakOver22PM() {
    ProgramWork programWork = new ProgramWork(23);
    assertEquals(programWork.getWorkState(programWork), "No, need to sleep");
  }

  @Test
  public void shouldBeHomeOver18PM() {
    ProgramWork programWork = new ProgramWork(18);
    programWork.setWorkFinished(true);
    assertEquals(programWork.getWorkState(programWork), "work finished, go home freely");
  }

}
