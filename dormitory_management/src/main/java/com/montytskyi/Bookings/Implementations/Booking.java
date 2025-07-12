package com.montytskyi.Bookings.Implementations;

import com.montytskyi.Bookings.Interfaces.Rentable;
import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Statuses.Implementations.BookingStatusReceiver;
import com.montytskyi.Statuses.Implementations.Status;
import com.montytskyi.Userables.Intrefaces.Userable;

/**
 * The class which represents the booking in the dormitory. The class contains the info about the rented place, the person who rents it, the price and the current status
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class Booking implements Rentable{

  /** The place which is rented by the client */
  private Liveable place;

  /** The client who rents the place */
  private Userable renter;

  /** The price paid for the rent */
  private double price;

  /** The current status of the renting */
  private Status bookingStatus;

  /** The empty constructor */
  public Booking(){

  }

  /**
   * The constructor with parameters without status
   * @param place - represents the place rented by the user
   * @param renter - the client who rents the place
   * @param price - the price paid for the rent
   */
  public Booking(Liveable place, Userable renter, double price){
    this.place = place;
    this.renter = renter;
    this.price = price;
  }

  /**
   * The constructor with all the parameters possible
   * @param place - represents the place rented by the user
   * @param renter - the client who rents the place
   * @param price - the price paid for the rent
   * @param bookingStatus - the current status of the booking
   */
  public Booking(Liveable place, Userable renter, double price, Status bookingStatus){
    this(place, renter, price);
    this.bookingStatus = bookingStatus;
  }

  /**
   * The setter method to define the place for renting
   * @param place - the place rented by the client
   */
  @Override
  public void setRentPlace(Liveable place) {
    this.place = place;
  }

  /**
   * The setter method to define the person who rents the place
   * @param renter - the client who rents the place
   */
  @Override
  public void setRenter(Userable renter) {
    this.renter = renter;
  }

  /**
   * The setter method which allows to set the price for the rent
   * @param price - the price for the rent
   */
  @Override
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * The setter method which allows to set the current status for the rent
   * @param stringLabel - the label which contains the information about the status
   */
  @Override
  public void setStatus(String stringLabel) {
    this.bookingStatus = (new BookingStatusReceiver()).receiveStatus(stringLabel);
  }

  /**
   * The getter method that returns the place rented by the user
   * @return place - the place rented by the user
   */
  @Override
  public Liveable getRentPlace() {
    return this.place;
  }

  /**
   * The getter method that returns the price for the rent
   * @return price - the price for the rent
   */
  @Override
  public double getRentPrice() {
    return this.price;
  }

  /**
   * The getter method that returns the renter who rents the place
   * @return renter - the client who rents the place
   */
  @Override
  public Userable getRenter() {
    return this.renter;
  }

  /**
   * The getter method that returns the status of the current renting
   * @return bookingStatus - the current status of the renting
   */
  @Override
  public Status getStatus() {
    return this.bookingStatus;
  }

}
