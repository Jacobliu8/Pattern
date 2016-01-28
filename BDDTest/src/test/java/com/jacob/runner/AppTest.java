package com.jacob.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by LIUJA8 on 1/28/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/TaskList.feature", glue = "com.jacob.steps")
public class AppTest {

}
