package com.montytskyi.Statuses.Implementations;

/**
 * The class which represents the status of an accommodation which can be rented by the user
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class AccomodationStatus extends Status{

  /**
   * The constructor of the class which allows to pass the status of an accommodation straightforwardly
   * @param accomodationStatus - which contains the information about the accomodation status
   */
  public AccomodationStatus(String accomodationStatus){
    super(accomodationStatus);
  }
}
