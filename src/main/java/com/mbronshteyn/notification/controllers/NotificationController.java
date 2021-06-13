package com.mbronshteyn.notification.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/notification")
public class NotificationController {
  @GetMapping("/greeting")
  public ResponseEntity greeting(){
    log.info("greeting called");
    return ResponseEntity.ok().body("hello world!!!");
  }
}

