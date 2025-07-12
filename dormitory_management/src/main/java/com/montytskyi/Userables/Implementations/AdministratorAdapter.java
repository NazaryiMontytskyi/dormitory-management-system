package com.montytskyi.Userables.Implementations;

import com.montytskyi.Bookings.Interfaces.Rentable;
import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Userables.Intrefaces.Userable;

/**
 * The class which adapts the some users operations defined in 'Userable' to connect them with administrative functions
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class AdministratorAdapter implements Userable{

  /** The administrator which abilities must be adapted to the requirements of 'Userable' interface */
  Administrator administrator;

  /** The user which will be serviced by the administrator */
  Userable user;

  /**
   * The constructor of the adapter which applies the Administrator using dependency injection
   * @param administrator - the administrator which will manage the system
   */
  public AdministratorAdapter(Administrator administrator){
    this.administrator = administrator;
  }

  /**
   * The method which allows to set the specific user who will be serviced by the administrator
   * @param user , which are going to be serviced
   */
  public void setUserToService(Userable user){
    this.user = user;
  }

  /**
   * The implemented method from the interface Userable which implements renting the place for the user
   * @param place - place, which will be rented for a while
   * @return Rentable, which represents the rent of a user
   */
  @Override
  public Rentable rent(Liveable place) {
    return this.administrator.rentForUser(place, user);
  }

  /**
   * The implmenented method from the interface Userable which implements payment process for the user
   * @param currentRent - Rentable, which represents the current rent bill of the user
   */
  @Override
  public void payForRent(Rentable currentRent) {
    System.out.println("The administrator provides the payment ability to user's rent");
  }

  /**
   * The implemented method from the interface Userable which provides the administrator an ability to cancel an existing user's rent
   * @param currentRent - Rentable, which represents an existing user's rent
   */
  @Override
  public void cancelRent(Rentable currentRent) {
    System.out.println("The administrator cancels user's rent");
    this.administrator.cancelRentForUser(currentRent);
  }

  /**
   * The implemented method from the interface Userable which provides the administrator an ability to edit a rent recently created by the user
   * @param currentRent - Rentable, which represents an existing user's rent
   */
  @Override
  public void editRent(Rentable currentRent) {
    this.administrator.editRentForUser(currentRent);
  }

}
