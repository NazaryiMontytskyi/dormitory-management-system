package com.montytskyi.Bookings.Interfaces;

import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Statuses.Implementations.Status;
import com.montytskyi.Statuses.Interfaces.StatusHaveable;
import com.montytskyi.Userables.Intrefaces.Userable;

/**
 * The interface which defines the logic of the place which can be rented by the client
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public interface Rentable extends StatusHaveable{

  /**
   * The method which allows to set the rent place which can be rented by the user
   * @param place - the place which can be rented by the user
   */
  public void setRentPlace(Liveable place);

  /**
   * The method which allows to set the renter which is renting the defined place
   * @param renter - a user or a client who rents the defined place
   */
  public void setRenter(Userable renter);

  /**
   * The method which allows to set the price for the rent
   * @param price - a double value which defines the price for the rent
   */
  public void setPrice(double price);

  /**
   * The method which allows to set the status of the renting
   * @param stringLabel - a value which defines the current status of the renting
   */
  public void setStatus(String stringLabel);

  /**
   * The method which allows to get the instance of rent place
   * @return Liveable rent place
   */
  public Liveable getRentPlace();

  /**
   * The method which allows to get the price for the rent
   * @return price for the rent
   */
  public double getRentPrice();

  /**
   * The method which allows to get the instance of the renter
   * @return Userable renter of the specific place
   */
  public Userable getRenter();

  /**
   * The method which allows to get the value of current renting status
   * @return Status of the current renting
   */
  public Status getStatus();

}
