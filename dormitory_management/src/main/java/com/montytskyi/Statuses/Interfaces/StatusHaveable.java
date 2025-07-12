package com.montytskyi.Statuses.Interfaces;

import com.montytskyi.Statuses.Implementations.Status;

/**
 * The specific interface which allows some classes to have a status defined in the class Status
 * @version 1.0
 * @author Nazarii Montytskyi
 */
public interface StatusHaveable {

  /**
   * A method which allows to set a specific status
   * @param statusLabel - which specifies a status
   */
  public void setStatus(String statusLabel);

  /**
   * A method which allows to get a current status
   * @return status, which is contained by the implementation class
   */
  public Status getStatus();

}
