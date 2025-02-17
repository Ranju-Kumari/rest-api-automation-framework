package com.api.base;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BaseService {
// This class will essentially be like a wrapper of Rest Assured
// Here we're storing Base URI
// Creating request
// Handling the response

    private static final String BASE_URL = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    public BaseService(){
        this.requestSpecification = given().baseUri(BASE_URL);
    }


    protected void setAuthToken(String token){
        requestSpecification.header("Authorization","Bearer "+token);
    }

    protected Response postRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }

    protected Response getRequest(String endpoint){
        return requestSpecification.get(endpoint);
    }

}
