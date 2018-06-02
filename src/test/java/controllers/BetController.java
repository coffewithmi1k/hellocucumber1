package controllers;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BetController extends AbstractController {


    public void getPetsByStatus(String status){
        RestAssured.baseURI="";
        RequestSpecification request = RestAssured.given();
    }
}
