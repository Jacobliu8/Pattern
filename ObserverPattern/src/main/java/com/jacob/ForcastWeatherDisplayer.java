package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class ForcastWeatherDisplayer implements Observer, Displayer {
  private float currentPressure = 29.2f;
  private float lastPressure;
  private Subject weather;

  public ForcastWeatherDisplayer(Subject weather) {
    this.weather = weather;
    weather.registerObserver(this);
  }

  public String display() {
    if (currentPressure > lastPressure) {
      return "forcast weather will raise";
    }
    if (currentPressure == lastPressure) {
      return "forcast weather will be same";
    }
    if (currentPressure < lastPressure) {
      return "forcast weather will be down";
    }
    return "";
  }

  public void update(float temperature, float humidity, float pressure) {
    lastPressure = currentPressure;
    currentPressure = pressure;
  }
}
