package com.montytskyi.Userables.Intrefaces;

import com.montytskyi.Bookings.Interfaces.Rentable;
import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;

/**
 * An interface that defines common methods to manage the users which will be use the dormitory management system
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public interface Userable {

  /**
   * @param place - the place which will be rented by the client
   * @return Rentable object that contains the information about the rent
   * @see com.montytskyi.Bookings.Interfaces.Rentable
   */
  public Rentable rent(Liveable place);

  /**
   * The method is responsible to provide the user an ability to pay the rent
   * @param currentRent - which has been already done by the user recently
   */
  public void payForRent(Rentable currentRent);

  /**
   * The method is responsible to cancel existing user's rent
   * @param currentRent - which should be cancelled
   */
  public void cancelRent(Rentable currentRent);

  /**
   * The method is responsible to edit the rent which was recently created by the user
   * @param currentRent - which should be edited
   */
  public void editRent(Rentable currentRent);

}
