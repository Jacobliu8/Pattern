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
    tshirt.decorate(Jacob);
    // tshirt.show();
    bigTrouser.decorate(Jacob);
    // bigTrouser.show();
    sneakers.decorate(Jacob);
    // sneakers.show();
    System.out.println(Jacob.getDressed());
    assertEquals(Jacob.show(), "T-shirt BigTrouser Sneakers Dressed Jacob");
  }

  @Test
  public void ShouldShowSuitTieLeatherShoesDressPersonJason() {
    Person Jason = new Person("Jason");
    Suit suit = new Suit();
    Tie tie = new Tie();
    LeatherShoes leatherShoes = new LeatherShoes();
    suit.decorate(Jason);
    // suit.show();
    tie.decorate(Jason);
    // tie.show();
    leatherShoes.decorate(Jason);
    // leatherShoes.show();
    assertEquals(Jason.show(), "Suit Tie LeatherShoes Dressed Jason");
  }
}
