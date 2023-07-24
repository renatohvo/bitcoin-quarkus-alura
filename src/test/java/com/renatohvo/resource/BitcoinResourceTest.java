package com.renatohvo.resource;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class BitcoinResourceTest {

    @Test
    public void testIfTheStatusCodeIs200() {
        RestAssured
                .given().get("/bitcoins")
                .then()
                    .statusCode(200);
    }
}
