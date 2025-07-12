package com.montytskyi.Userables.Implementations;

import com.montytskyi.Bookings.Implementations.Booking;
import com.montytskyi.Bookings.Interfaces.Rentable;
import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Userables.Intrefaces.Userable;

/**
 * The class which represents the manager of the dormitory management systems
 * @version 1.0
 * @author Nazarii Montytskyi
 */
public class Administrator {

  /** The name of the administrator */
  private String name;

  /** The surname of the administrator */
  private String surname;

  /**
   * An empty constructor of a class
   */
  public Administrator(){

  }

  /**
   * A constructor with all of the parameters possible which includes name and surname
   * @param name - which represents the administrator's name
   * @param surname - which represents the administrator's surname
   */
  public Administrator(String name, String surname){
    this.name = name;
    this.surname = surname;
  }

  /**
   * A method which provides the administrator an ability to make a new rent for an existing user
   * @param place - which will be rented by a specific user
   * @param renter - which is a user who rents a specific place
   * @return Rentable, which represents a rent created by some user
   */
  public Rentable rentForUser(Liveable place, Userable renter){
    System.out.println("Administrator books a place for a user");
    return new Booking(place, renter, 200);
  }

  /**
   * A method which provides the administrator with an ability to cancel an existing rent of an existing user
   * @param rent - represents a renting offer which recently was created by an user
   */
  public void cancelRentForUser(Rentable rent){
    System.out.println("Admin cancels the rent for the user");
    rent.setStatus("FINISHED");
  }

  /**
   * A method which provides the administrator with an ability to edit an existing rent of an existing user
   * @param rent - which represents an existing user's rent
   */
  public void editRentForUser(Rentable rent){
    System.out.println("Admin changes rent for user");
  }

  /**
   * A getter method of the class which allows to receive a name of the administrator
   * @return name, String value which contains the name of the administrator
   */
  public String getName() {
    return name;
  }

  /**
   * A setter method of the class which allows to set a name for the specific administrator
   * @param name - a name which will be set for the administrator
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A getter method of the class which allows to receive a surname of the specific administrator
   * @return surname, the surname of the specific administrator
   */
  public String getSurname() {
    return surname;
  }

  /**
   * A setter method of the class which allows to set a surname for the specific administrator
   * @param surname - which contains the surname of an administrator
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }
}
