package com.code.refactor.chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIUJA8 on 1/26/2016.
 */
public class Cutomer {
  private String name;
  private List<Rental> rentalList = new ArrayList<Rental>();

  public Cutomer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentalList.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    String result = "Rental Record For " + getName() + "\n";
    for (Rental rental : rentalList) {
      frequentRenterPoints += rental.getFrequentRenterPoints();
      result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
      totalAmount += rental.getCharge();
    }
    result += "Amount owner is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    return result;
  }

}
