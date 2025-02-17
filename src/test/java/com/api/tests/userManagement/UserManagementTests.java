package com.api.tests.userManagement;

import com.api.base.authentication.AuthService;
import com.api.base.userManagement.UserManagementService;
import com.api.pojo.requests.authentication.LoginRequest;
import com.api.pojo.responses.LoginResponse;
import com.api.pojo.responses.UserManagementResponse;
import com.beust.ah.A;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserManagementTests {

    @Test(description = "Verify able to get user profiles.")
    public void getUserProfileTest(){

        AuthService authService = new AuthService();
        Response response = authService.login(new LoginRequest("ranju123", "ranju123"));

        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());

        UserManagementService userManagementService = new UserManagementService();
        response = userManagementService.getProfile(loginResponse.getToken());

        UserManagementResponse userManagementResponse = response.as(UserManagementResponse.class);
        System.out.println(userManagementResponse.getFirstname());
    }
}
