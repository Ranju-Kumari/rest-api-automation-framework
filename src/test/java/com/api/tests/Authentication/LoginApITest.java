package com.api.tests.Authentication;

import com.api.base.authentication.AuthService;
import com.api.pojo.requests.authentication.LoginRequest;
import com.api.pojo.responses.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginApITest {

    @Test(description = "Verify if login is working fine")
    public void loginTest(){

        LoginRequest loginRequest = new LoginRequest("ranju123","ranju123");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);

       LoginResponse loginResponse = response.as(LoginResponse.class);
       System.out.println(loginResponse.getUsername());
       System.out.println(response.asPrettyString());
    }


}
