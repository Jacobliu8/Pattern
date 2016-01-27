package com.code.refactor.chapter6;

/**
 * Created by LIUJA8 on 1/26/2016.
 */
public class Rental {
  private Movie movie;
  private int daysRented;

  public Rental(Movie movie, int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public int getDaysRented() {
    return daysRented;
  }

  double getCharge() {
    double thisAmout = 0;
    switch (getMovie().getPriceCode()) {
      case Movie.REGULAR:
        thisAmout += 2;
        if (getDaysRented() > 2) {
          thisAmout += (getDaysRented() - 2) * 1.5;
        }
        break;
      case Movie.NEW_RELEASE:
        thisAmout += getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmout += 1.5;
        if (getDaysRented() > 3) {
          thisAmout += (getDaysRented() - 3) * 1.5;
        }
        break;
    }
    return thisAmout;
  }

  int getFrequentRenterPoints() {
    if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) {
      return 2;
    } else {
      return 1;
    }
  }
}
