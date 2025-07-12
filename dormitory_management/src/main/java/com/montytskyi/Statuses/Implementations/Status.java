package com.montytskyi.Statuses.Implementations;

/**
 * The class which represents a specific status for the entities which require it
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public class Status {

  /** A field which defines a status */
  private String status;

  /**
   * The constructor which allows to set a status strightforwardly
   * @param status - which is represented by the string which contains it
   */
  public Status(String status){
    this.status = status;
  }

  /**
   * The getter method of a class which allows to receive a current status
   * @return status
   */
  public String getStatus(){
    return this.status;
  }
}
