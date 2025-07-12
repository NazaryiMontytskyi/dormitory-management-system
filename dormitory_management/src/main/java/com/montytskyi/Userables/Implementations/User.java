package com.montytskyi.Userables.Implementations;

import com.montytskyi.Bookings.Implementations.Booking;
import com.montytskyi.Bookings.Interfaces.Rentable;
import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Userables.Intrefaces.Userable;

/**
 * The class 'User' implements interface 'Userable' in order to implement the logic of managing users' rents in the dormitory
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class User implements Userable{

  /** The name of user */
  private String name;

  /** The surname of user */
  private String surname;

  /** The phone number of user */
  private String phoneNumber;

  /** The email of user */
  private String email;

  /** The empty constructor of a class */
  public User(){

  }

  /**
   * The constructor which receives all parameters possible
   * @param name - the name of the user
   * @param surname - the surname of the user
   * @param phoneNumber - the phone number of the user
   * @param email - the email of the user
   */
  public User(String name, String surname, String phoneNumber, String email){
    this.name = name;
    this.surname = surname;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  /**
   * The method implemented from the interface 'Userable' which goal is to rent the place for the user
   * @param place - the place which will be rented by the user
   * @return Returns the rent which consists the user information and the data about the place it's rented
   */
  @Override
  public Rentable rent(Liveable place) {
    System.out.println("User rents the place");
    Rentable newRent = new Booking(place, this, 200);
    newRent.setStatus("BOOKED");
    return newRent;
  }

  /**
   * The method implemented from the interface 'Userable' which goal is to provide a payment for the rent
   * @param currentRent - receives a created rent where user becomes provided with the ability to pay for the rent
   */
  @Override
  public void payForRent(Rentable currentRent) {
    currentRent.setStatus("PAIED");
    System.out.println("User pays for the rent");
  }

  /**
   * The method implemented from the interface 'Userable' which goal is to cancel user's existing rent
   * @param currentRent - receives an existing user's rent which has been recently created
   */
  @Override
  public void cancelRent(Rentable currentRent) {
    currentRent.setStatus("FINISHED");
    System.out.println("User cancels the rent");
  }

  /**
   * The method implemented from the interface 'Userable' which goal is to edit existing user's rent
   * @param currentRent - receives an existing user's rent which has been recently created
   */
  @Override
  public void editRent(Rentable currentRent) {
    System.out.println("User edits his rent");
  }

  /**
   * The getter method for the user's name
   * @return a User's name
   */
  public String getName() {
    return name;
  }

  /**
   * The setter for the user's name
   * @param name - the name of the user
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The getter for user's surname
   * @return the User's surname
   */
  public String getSurname() {
    return surname;
  }

  /**
   * The setter method for user's surname
   * @param surname - The user's surname
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   * The getter method for user's phone number
   * @return the User's phone number
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * The setter method for user's phone number
   * @param phoneNumber - the user's phone number
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The getter for user's email
   * @return the user's email
   */
  public String getEmail() {
    return email;
  }

  /**
   * The setter method for user's email
   * @return the user's email
   */
  public void setEmail(String email) {
    this.email = email;
  }

}
