package controllers;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class AbstractController {

    String myString= RestAssured.baseURI="http://petstore.swagger.io/v2";
    RequestSpecification request = RestAssured.given();


   public AbstractController(){


    }
}
