package com.mbronshteyn.notification.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mbronshteyn.notification.model.Notification;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.mockito.internal.hamcrest.HamcrestArgumentMatcher;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NotificationControllerTest {

  @LocalServerPort private int port;

  @Test
  public void testGetMessage() {
    given().port(this.port).when().get("/notifications").then().statusCode(200);
  }

  @Test
  public void testAdd() throws Exception {

    Notification notification =
        Notification.builder().to("mike").messageBody("test message").build();

    // Normal use case - add successful
    given()
        .port(this.port)
        .contentType(ContentType.JSON)
        .body(notification)
        .when()
        .post("/notifications")
        .then()
        .statusCode(200)
        .body("messageBody", is("test message"));
  }
}
