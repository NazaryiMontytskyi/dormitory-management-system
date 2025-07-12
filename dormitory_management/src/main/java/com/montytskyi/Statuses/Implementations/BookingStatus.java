package com.montytskyi.Statuses.Implementations;

/**
 * The class which represents the status of an booking made by user
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class BookingStatus extends Status{

  /**
   * The constructor which allows to set the booking status
   * @param bookingStatus - which contains the info about status of a booking which is about to be created
   */
  public BookingStatus(String bookingStatus){
    super(bookingStatus);
  }
}
