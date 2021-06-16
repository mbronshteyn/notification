package com.mbronshteyn.notification.model;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

@Value
@Slf4j
public class Notification {
  private String channel;
  private String topic;
  private String to;
  private String from;
  private String messageBody;
  private String host;
}
