package com.jacob;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
@Person(name = "Jacob", age = 24)
public class PersonTest {
  public Person getPerson() {
    Class c = PersonTest.class;
    Person p = (Person) c.getAnnotation(Person.class);
    if (p != null) {
      return p;

    } else {
      return null;
    }
  }

  @Test
  public void TestPerson() {
    assertEquals(getPerson().name(), "Jacob");
  }
}
