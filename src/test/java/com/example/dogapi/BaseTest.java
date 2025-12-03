package com.example.dogapi;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import io.qameta.allure.junit5.AllureJunit5;

@ExtendWith(AllureJunit5.class)
public class BaseTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://dog.ceo/api/";
    }
}
