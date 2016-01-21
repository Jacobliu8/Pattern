package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class CurrentWeatherDisplayer implements Displayer, Observer {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public CurrentWeatherDisplayer(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public String display() {
    return "current codition: " + temperature + "F degrees and " + humidity + "% humidity";
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
  }
}
