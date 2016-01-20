package com.jacob;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class PersonTest {
  @Test
  public void ShouldShowTshirtAndBigTrouserAndSneakersDressPersonJacob() {
    Person Jacob = new Person("Jacob");
    Tshirt tshirt = new Tshirt();
    BigTrouser bigTrouser = new BigTrouser();
    Sneakers sneakers = new Sneakers();
    Jacob.setDressed(tshirt.weared(Jacob.getDressed()));
    Jacob.setDressed(bigTrouser.weared(Jacob.getDressed()));
    Jacob.setDressed(sneakers.weared(Jacob.getDressed()));
    assertEquals(Jacob.show(), "T-shirt BigTrouser Sneakers Dressed Jacob");
  }

  @Test
  public void ShouldShowSuitTieLeatherShoesDressPersonJason() {
    Person Jason = new Person("Jason");
    Suit suit = new Suit();
    Tie tie = new Tie();
    LeatherShoes leatherShoes = new LeatherShoes();
    Jason.setDressed(suit.weared(Jason.getDressed()));
    Jason.setDressed(tie.weared(Jason.getDressed()));
    Jason.setDressed(leatherShoes.weared(Jason.getDressed()));
    assertEquals(Jason.show(), "Suit Tie LeatherShoes Dressed Jason");
  }
}
