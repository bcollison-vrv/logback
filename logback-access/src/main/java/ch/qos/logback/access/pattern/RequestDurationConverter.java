package ch.qos.logback.access.pattern;

import ch.qos.logback.access.spi.IAccessEvent;

public class RequestDurationConverter extends AccessConverter {

  @Override
  public String convert(IAccessEvent accessEvent) {
    return Long.toString(accessEvent.getEndTime() - accessEvent.getStartTime());
  }

}
