package com.code.refactor.chapter6.substitute.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LIUJA8 on 1/27/2016.
 */
public class Example {
  String foundPerson(String[] people) {
    List<String> candidates = Arrays.asList("Don", "John", "Kent");
    for (int i = 0; i < people.length; i++) {
      if (candidates.contains(people[i])) {
        return people[i];
      }
    }
    return "";
  }
}
