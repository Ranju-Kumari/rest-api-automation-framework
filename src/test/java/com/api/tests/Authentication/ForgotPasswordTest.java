package com.api.tests.Authentication;

import com.api.base.authentication.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {

    @Test(description = "Verify forgot password functionality.")
    public void forgotPasswordTest(){
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("ranjuk99@gmail.com");

        System.out.println(response.asPrettyString());
    }


}
