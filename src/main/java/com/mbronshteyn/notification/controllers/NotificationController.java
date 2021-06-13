package com.mbronshteyn.notification.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {
  @GetMapping("/greeting")
  public String index(){
    return "Hello world!!!";
  }
}

