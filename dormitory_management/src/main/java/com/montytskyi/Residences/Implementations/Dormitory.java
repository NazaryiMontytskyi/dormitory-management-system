package com.montytskyi.Residences.Implementations;

import java.util.List;

import com.montytskyi.Bookings.Interfaces.Rentable;
import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Residences.Interfaces.ResidenceServiceable;
import com.montytskyi.Userables.Implementations.Administrator;

/**
 * The class which represents the Dormitory which will be managed by the system. The Dormitory class is implemented from the ResidenceServiceable interface.
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class Dormitory implements ResidenceServiceable{

  /**
   * A constructor that receives all the parameters possible
   * @param rents - the collection of rents which is in charge of containing the dormitory rents
   * @param admins - the collection of administrators which is responsible of containing the dormitory administrators
   * @param places - the collection of places which is responsible of containing all the dormitory renting places
   */
  public Dormitory(List<Rentable> rents, List<Administrator> admins, List<Liveable> places) {
    this.rents = rents;
    this.admins = admins;
    this.places = places;
  }

  /**
   * An empty constructor of the Dormitory class
   */
  public Dormitory() {
  }

  /** A field which is responsible of containing the Dormitory rents */
  private List<Rentable> rents;

  /**
   * A field which is repsonsible of containing the Dormitory administrators
   */
  private List<Administrator> admins;

  /**
   * A filed which is responsible of containing the Dormitory rentable places
   */
  private List<Liveable> places;

  /**
   * An implemented method from the interface ResidenceServiceable which allows to add a rent to the dormitory
   * @param rent - represents a rent made by an user
   */
  @Override
  public void addRent(Rentable rent) {
    this.rents.add(rent);
  }

  /**
   * An implemented method from the interface ResidenceServiceable which allows to remove an existing rent from the dormitory
   * @param rent - represent a rent made by an user
   */
  @Override
  public void removeRent(Rentable rent) {
    this.rents.remove(rent);
  }

  /**
   * An implemented method from the interface ResidenceServiceable which allows to add a rentable place to the dormitory
   * @param place - represents a place which is able to be rented by an user
   */
  @Override
  public void addPlace(Liveable place) {
    this.places.add(place);
  }

  /**
   * An implemented method from the interface ResidenceServiceable which allows to add remove an existing in the dormitory place
   * @param place - represents a place which is able to be rented by an user
   */
  @Override
  public void removePlace(Liveable place) {
    this.places.remove(place);
  }

  /**
   * An implemented method from the interface ResidenceServiceable which allows to add an administrator for the specific Dormitory
   */
  @Override
  public void addAdministrator(Administrator admin) {
    this.admins.add(admin);
  }

  /**
   * An implemented method from the interface ResidenceServiceable which allows to remove an administrator from the specific Dormitory
   */
  @Override
  public void removeAdministrator(Administrator admin) {
    this.admins.remove(admin);
  }

  /**
   * A getter method which returns the list of existing rents in the dormitory
   * @return rents - list of existing rents in the dormitory
   */
  public List<Rentable> getRents() {
    return rents;
  }

  /**
   * A setter method which sets the collection of rents which will be contained in the Dormitory
   * @param rents - list of rents in the dormitory
   */
  public void setRents(List<Rentable> rents) {
    this.rents = rents;
  }

  /**
   * A getter method which allows to get the collection of the administrators
   * @return admins - the list of existing administrator in the dormitory
   */
  public List<Administrator> getAdmins() {
    return admins;
  }

  /**
   * A setter method which allows to set the collection of the administrators for the dormitory
   * @param admins - the list of administrators of the specific dormitory
   */
  public void setAdmins(List<Administrator> admins) {
    this.admins = admins;
  }

  /**
   * A getter method which return the list of places which are the part of the dormitory
   * @return places - the list of places in the dormitory which can be rented by some client
   */
  public List<Liveable> getPlaces() {
    return places;
  }

  /**
   * A setter method which sets the list of places which are the part of the dormitory
   * @param places - the list of places in the dormitory which can be rented by some client
   */
  public void setPlaces(List<Liveable> places) {
    this.places = places;
  }

}
