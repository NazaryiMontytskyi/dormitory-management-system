package com.montytskyi.DormitoriesPlaces.Implementations;

import com.montytskyi.DormitoriesPlaces.Interfaces.Liveable;
import com.montytskyi.Statuses.Implementations.AccomodationStatusReceiver;
import com.montytskyi.Statuses.Implementations.Status;

/**
 * The class which implements Liveable interface and represents an accomodation which can be rented by some client
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class Accomodation implements Liveable {

  /** The integer field which represents the floor on which the accommodation is located */
  private int floor;

  /** The integer field which represents the number of room */
  private int roomNumber;

  /** The value which represents the current status of an accommodation */
  private Status status;

  /**
   * The constructor with all the parameters possible
   * @param floor - integer value which represents the floor where the room is located
   * @param roomNumber - integer value which represents the number of room
   * @param status - the value which represents the current status of an accommodation
   */
  public Accomodation(final int floor, final int roomNumber, final Status status){
    this.floor = floor;
    this.roomNumber = roomNumber;
    this.status = status;
  }

  /**
   * The constructor with parameter which identifies the room's coordinates
   * @param floor - integer value which represents the floor where the room is located
   * @param roomNumber - integer value which represents the number of room
   */
  public Accomodation(final int floor, final int roomNumber){
    this.floor = floor;
    this.roomNumber = roomNumber;
    this.status = (new AccomodationStatusReceiver()).receiveStatus("FREE");
  }

  /**
   * Am empty class constructor
   */
  public Accomodation(){

  }

  /**
   * The setter method which is implemented from the interface and provides the ability to set the status
   * @param statusLabel - string which contains the current status of the accommodation
   */
  @Override
  public void setStatus(String statusLabel) {
    this.status = (new AccomodationStatusReceiver()).receiveStatus(statusLabel);
  }

  /**
   * The getter method which is implemented from the interface and provides the ability to get the current accomodation status
   * @return status - the current status of an accommodation
   */
  @Override
  public Status getStatus() {
    return this.status;
  }

  /**
   * The getter method which return the floor number
   * @return floor - the floor where the room is located
   */
  public int getFloor() {
    return floor;
  }

  /**
   * The setter method which allows to set the floor of the room
   * @param floor - the floor where the room is located
   */
  public void setFloor(int floor) {
    this.floor = floor;
  }

  /**
   * The getter method which allows to receive the number of the room
   * @return roomNumber - the value which contains the number of the room
   */
  public int getRoomNumber() {
    return roomNumber;
  }

  /**
   * The setter method which allows to set the number of the room
   * @param roomNumber - the value which contains the number of the room
   */
  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

}
