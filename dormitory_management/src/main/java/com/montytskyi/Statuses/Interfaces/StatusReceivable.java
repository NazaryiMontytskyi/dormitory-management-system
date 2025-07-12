package com.montytskyi.Statuses.Interfaces;

import com.montytskyi.Statuses.Implementations.Status;

/**
 * The interface which defines the implementations which has some status or requires it
 * @author Nazarii Montytskyi
 * @version 1.0
 */
public interface StatusReceivable {

  /**
   * The method which returns a specific status according to a label which provides an ability to define those status
   * @param statusLabel - which contains label, which allows to define the status
   * @return Status, which is defined by the method
   */
  public Status receiveStatus(String statusLabel);

}
