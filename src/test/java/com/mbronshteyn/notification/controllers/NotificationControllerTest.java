package com.mbronshteyn.notification.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;

@SpringBootTest
class NotificationControllerTest {

  @Test
  public void givenUrl_whenSuccessOnGetsResponse() {
    given().when().get("/notifications").then().statusCode(200);
  }

}