package com.example.dogapi;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BreedImagesTest extends BaseTest {
    @Test
    public void shouldReturnImagesForBreed() {
        given()
        .pathParam("breed", "hound")
        .when().get("breed/{breed}/images")
        .then().statusCode(200)
        .body("status", equalTo("success"))
        .body("message", notNullValue());
    }
}
