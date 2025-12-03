package com.example.dogapi;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RandomImageTest extends BaseTest {
    @Test
    public void shouldReturnRandomImage() {
        given()
        .when().get("breeds/image/random")
        .then().statusCode(200)
        .body("status", equalTo("success"))
        .body("message", containsString("https://"));
    }
}
