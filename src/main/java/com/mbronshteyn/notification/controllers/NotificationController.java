package com.mbronshteyn.notification.controllers;

import com.mbronshteyn.notification.model.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/notifications")
public class NotificationController {
  @GetMapping()
  public ResponseEntity greeting(){
    log.info("greeting called");
    return ResponseEntity.ok().body("hello world!!!");
  }

  @PostMapping()
  public ResponseEntity postMessage(Notification notification) {
    return ResponseEntity.ok().build();
  }
}

