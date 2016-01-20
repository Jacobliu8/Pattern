package com.jacob;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class PersonTest {
  @Test
  public void ShouldShowTshirtAndBigTrouserAndSneakersDressPersonJacob() {
    Person Jacob = new Person("Jacob");
    Jacob.wearTshirt();
    Jacob.wearBigTrouser();
    Jacob.wearSneakers();
    assertEquals(Jacob.show(), "T-shirt BigTrouser Sneakers Dressed Jacob");
  }

}
