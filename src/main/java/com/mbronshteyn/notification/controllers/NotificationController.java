package com.mbronshteyn.notification.controllers;

import com.mbronshteyn.notification.model.Notification;
import com.mbronshteyn.notification.services.EmailService;
import com.mbronshteyn.notification.services.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/notifications")
public class NotificationController {

  private EmailService emailService;

  @Autowired
  NotificationController(EmailService emailService) {
    this.emailService = emailService;
  }

  // TODO: temp endpoint, for testing
  @GetMapping
  public ResponseEntity get() {
    log.info("greeting called");
    return ResponseEntity.ok().body("hello world!!!");
  }

  @PostMapping
  public ResponseEntity post(@RequestBody Notification notification) throws Exception {
    log.info("Received {}", notification);
    emailService.sendEmail(notification.getTo(), notification.getTopic());
    return ResponseEntity.ok().body(notification);
  }

  @GetMapping("/json")
  public Notification returnObjectInBrowser() {
    Notification notification = new Notification();
    notification.setTopic("hello message");
    notification.setFrom("mike");
    notification.setTopic("ellen");

    return notification;
  }
}
