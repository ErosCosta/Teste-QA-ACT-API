package com.example.dogapi;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BreedsListTest extends BaseTest {
    @Test
    public void shouldReturnListOfBreeds() {
        given()
        .when().get("breeds/list/all")
        .then().statusCode(200)
        .body("status", equalTo("success"))
        .body("message", notNullValue());
    }
}
