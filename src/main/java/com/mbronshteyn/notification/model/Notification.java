package com.mbronshteyn.notification.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

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
  private String user;
  private List<Meeting> meetingList;
}
