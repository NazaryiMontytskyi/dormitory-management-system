package com.montytskyi.Statuses.Implementations;

import com.montytskyi.Statuses.Interfaces.StatusReceivable;

/**
 * An implementation class of the StatusReceivable interface which allows to create a status for the booking made by the user
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class BookingStatusReceiver implements StatusReceivable{

  /**
   * A method implemented from the interface StatusReceivable which allows to receive a specific status of a user's booking
   * @param statusLabel - a string which defines a status of a booking
   * @throws IllegalArgumentException
   * @return Booking Status of an existing user's booking
   */
  @Override
  public Status receiveStatus(String statusLabel) {
    switch (statusLabel) {
      case "NOT BOOKED":
        return new BookingStatus("NOT BOOKED");
      case "BOOKED":
        return new BookingStatus("BOOKED");
      case "PAIED":
        return new BookingStatus("PAIED");
      case "FINISHED":
        return new BookingStatus("FINISHED");
      default:
        throw new IllegalArgumentException("Booking status should receive one of the three its statuses: 'NOT BOOKED', 'BOOKED', 'PAIED'");
    }
  }

}
