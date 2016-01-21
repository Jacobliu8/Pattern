package com.jacob;

import com.jacob.CurrentWeatherDisplayer;
import com.jacob.ForcastWeatherDisplayer;
import com.jacob.StaticsWeatherDisplayer;
import com.jacob.WeatherData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.misc.Cleaner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class ObserverDataDisplayTest {
  WeatherData weatherData;
  CurrentWeatherDisplayer currentWeatherDisplayer;
  StaticsWeatherDisplayer staticsWeatherDisplayer;
  ForcastWeatherDisplayer forcastWeatherDisplayer;

  @Before
  public void setUp() {
    weatherData = new WeatherData();
    currentWeatherDisplayer = new CurrentWeatherDisplayer(weatherData);
    staticsWeatherDisplayer = new StaticsWeatherDisplayer(weatherData);
    forcastWeatherDisplayer = new ForcastWeatherDisplayer(weatherData);
  }

  @Test
  public void testCurrentWeatherDisplay() {
    weatherData.setMeasurements(80, 65, 30.4f);
    assertEquals("current codition: 80.0F degrees and 65.0% humidity", currentWeatherDisplayer.display());
  }

  @Test
  public void testStaticsWeatherDisplay() {
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(81, 52, 23.0f);
    weatherData.setMeasurements(82, 32, 323f);
    if (staticsWeatherDisplayer.getNumOfReadings() == 3) {
      assertEquals((float) (80 + 81 + 82), staticsWeatherDisplayer.getTemperatureSum());
    }
    if (staticsWeatherDisplayer.getNumOfReadings() == 4) {
      assertEquals((float) 80 + 80 + 81 + 82, staticsWeatherDisplayer.getTemperatureSum());
    }
  }

}
