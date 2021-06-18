package com.mbronshteyn.notification.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
  private String channel;
  private String topic;
  private String to;
  private String from;
  private String messageBody;
  private String host;
}
