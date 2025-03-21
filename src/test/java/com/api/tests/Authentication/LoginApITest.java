package com.api.tests.Authentication;

import com.api.service.authentication.AuthService;
import com.api.pojo.requests.authentication.LoginRequest;
import com.api.pojo.responses.authentication.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginApITest {

    @Test(description = "Verify if login is working fine")
    public void loginTest(){

        LoginRequest loginRequest = new LoginRequest("ranju123","ranju123");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);

       LoginResponse loginResponse = response.as(LoginResponse.class);//Here, the response is coming in JSON format
        // The purpose of 'as' method is to convert the JSON object into the Java object that particular class type
       System.out.println(loginResponse.getUsername());
       System.out.println(response.asPrettyString());
    }


}
