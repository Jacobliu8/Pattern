package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class StaticsWeatherDisplayer implements Displayer, Observer {
  private float maxTemp = 0.0f;
  private float minTemp = 200f;
  private float temperatureSum = 0;
  private int numOfReadings = 0;
  private Subject weather;

  public float getTemperatureSum() {
    return temperatureSum;
  }

  public StaticsWeatherDisplayer(Subject weather) {
    this.weather = weather;
    weather.registerObserver(this);
  }

  public int getNumOfReadings() {
    return numOfReadings;
  }

  public void setNumOfReadings(int numOfReadings) {
    this.numOfReadings = numOfReadings;
  }

  public String display() {
    return "Avg/Max/Min temperature = " + RoudFloatToString(temperatureSum / numOfReadings) + "F/" + maxTemp + "F/" + minTemp + "F";
  }

  private String RoudFloatToString(float v) {
    return String.valueOf(v);
  }

  public void update(float temperature, float humidity, float pressure) {
    temperatureSum += temperature;
    numOfReadings++;
    if (temperature > maxTemp) {
      maxTemp = temperature;
    }
    if (temperature < minTemp) {
      minTemp = temperature;
    }
  }
}
