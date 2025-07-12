package com.montytskyi.Statuses.Implementations;

import com.montytskyi.Statuses.Interfaces.StatusReceivable;

/**
 * A class which responsibility is to return the status of an accomodation according to its occupation by the client
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class AccomodationStatusReceiver implements StatusReceivable {

  /**
   * The method which is implemented from the interface StatusReceivable. Method provides the status of an accomodation
   * @param statusLabel - which contains the info about the status of an acommodation
   * @throws IllegalArgumentException
   * @return AccomodationStatus which can be presented as value of "FREE" or "BUSY"
   */
  @Override
  public Status receiveStatus(String statusLabel){
    switch(statusLabel){
      case "FREE":
        return new AccomodationStatus("FREE");
      case "BUSY":
        return new AccomodationStatus("BUSY");
      default:
        throw new IllegalArgumentException("The status for accomodation must have value 'FREE' or 'BUSY");
    }
  }
}
