package com.api.tests.Authentication;

import com.api.service.authentication.AuthService;
import com.api.pojo.requests.authentication.SignupRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest {

    @Test(description = "Verify able to signup for account creation.")
    public void signup(){

        SignupRequest signupRequest = new SignupRequest.Builder()
                .username("ranju99")
                .password("ranju99")
                .email("ranju99@gmail.com")
                .firstname("ranju99")
                .lastname("k")
                .mobilenumber("0987654321").build();

        AuthService authService = new AuthService();
        Response response = authService.signup(signupRequest);
        Assert.assertEquals(response.asPrettyString(),"User registered successfully!");

    }
}
