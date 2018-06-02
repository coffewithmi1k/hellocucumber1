package controllers;

import static io.restassured.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UserController {
    String baseUrl = "http://46.101.196.83/api";
    String pathSign = "/oauth/token";
    String token = "";


    @Test
    public void checkUserSignIn() {
        RequestSpecification request =
                RestAssured.given().baseUri(baseUrl);
        request.headers("Content-Type", "application/x-www-form-urlencoded", "Authorization", "Basic YmV0MTE6YmV0MTE=")
                .formParam("grant_type", "password")
                .formParam("username", "coffe90@mailinator.com")
                .formParam("platform", "ANDROID")
                .formParam("password", "Qwe1156q@@").when().post(pathSign)
                .then()
                .statusCode(200)
                .body("access_token", equalTo("mybody"));


    }
}
