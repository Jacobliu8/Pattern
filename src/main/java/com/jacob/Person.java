package com.jacob;

import java.lang.annotation.*;

/**
 * Created by LIUJA8 on 1/19/2016.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Person {
  String name() default "XXX";

  int age() default 0;
}
