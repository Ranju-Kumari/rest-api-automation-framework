package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoLoginAPITest {

    @Test(description = "Able to login")
    public void login(){

        RestAssured.baseURI = "http://64.227.160.186:8080";
        RequestSpecification x= RestAssured.given();
        RequestSpecification y = x.header("Content-type","application/json");
        RequestSpecification z = y.body("{\"username\":\"uday123\",\"password\":\"uday123\"}");
        Response response = z.post("/api/auth/login");

        Assert.assertEquals(response.getStatusCode(),200);
    }



}
