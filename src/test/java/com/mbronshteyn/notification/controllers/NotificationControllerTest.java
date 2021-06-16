package com.mbronshteyn.notification.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NotificationControllerTest {

  @LocalServerPort
  private int port;

  @Test
  public void givenUrl_whenSuccessOnGetsResponse() {
    given().port(this.port).when().get("/notifications").then().statusCode(200);
  }

}