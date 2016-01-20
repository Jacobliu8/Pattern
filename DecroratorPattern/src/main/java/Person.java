/**
 * Created by LIUJA8 on 1/20/2016.
 */
public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public void wearTshirt() {
    System.out.println("大Tshirt ");
  }

  public void wearBigTrouser() {
    System.out.println("垮裤 ");
  }

  public void wearSneakers() {
    System.out.println("破球鞋 ");
  }

  public void wearSuit() {
    System.out.println("西服 ");
  }

  public void wearTie() {
    System.out.println("领带 ");
  }

  public void wearLeatherShoes() {
    System.out.println("皮鞋 ");
  }

  public void show() {
    System.out.println("装扮的" + name);
  }
}
