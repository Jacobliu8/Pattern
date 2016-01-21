package com.jacob;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public class WeatherData implements Subject {
  private List<Observer> observers = new ArrayList<Observer>();
  private float temperature;
  private float humidity;
  private float pressure;

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObserver() {
    for (Observer ob : observers) {
      ob.update(temperature, humidity, pressure);
    }
  }

  public void measurementChanged() {
    notifyObserver();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementChanged();
  }
}
