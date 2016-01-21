package com.jacob;

/**
 * Created by LIUJA8 on 1/21/2016.
 */
public interface Subject {
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObserver();
}
