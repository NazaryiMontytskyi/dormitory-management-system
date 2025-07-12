package com.montytskyi.Residences.Interfaces;

import com.montytskyi.Bookings.Interfaces.Rentable;
import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Userables.Implementations.Administrator;

/**
 * The interface which represents an instution which can be user for the renting dormitories or accommodations
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public interface ResidenceServiceable {

  /**
   * The method which allows to add the created rent to the specific residence
   * @param rent - a renting offer created by the specific client
   */
  public void addRent(Rentable rent);

  /**
   * The method which provides the ability to remove the rent from the specific residence
   * @param rent - a renting offer that should be removed from the dormitory
   */
  public void removeRent(Rentable rent);

  /**
   * The method which provides the ability to add an existing or recently created place which is able to be rented to the specific residence
   * @param place - the place that will be added to an specific residence
   */
  public void addPlace(Liveable place);

  /**
   * The method that allows to remove the place from an specific residence
   * @param place - the place which is about to be removed from the specific residence
   */
  public void removePlace(Liveable place);

  /**
   * The method that allows to add an administrator for the specific residence
   * @param admin - the administrator who will be in charge of the specific residence
   */
  public void addAdministrator(Administrator admin);

  /**
   * The method that allows to remove an existing the administrator from the specific residence
   * @param admin - the administrator that should be removed from the specific residence
   */
  public void removeAdministrator(Administrator admin);

}
