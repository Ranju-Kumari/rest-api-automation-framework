package com.api.tests.userManagement;

import com.api.pojo.requests.usermanagement.UpdateProfileRequest;
import com.api.service.authentication.AuthService;
import com.api.service.userManagement.UserManagementService;
import com.api.pojo.requests.authentication.LoginRequest;
import com.api.pojo.responses.authentication.LoginResponse;
import com.api.pojo.responses.userManagement.UserManagementResponse;
import io.restassured.response.Response;
import org.testng.Assert;
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


    @Test(description = "Verify able to update user profiles")
    public void updateProfileTest(){

        AuthService authService = new AuthService();
        Response response = authService.login(new LoginRequest("ranju123", "ranju123"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println("--------------------------------------------------------------");

        UserManagementService userManagementService =  new UserManagementService();
        response = userManagementService.getProfile(loginResponse.getToken());
        System.out.println(response.asPrettyString());
        UserManagementResponse userManagementResponse = response.as(UserManagementResponse.class);
        Assert.assertEquals(userManagementResponse.getUsername(),"ranju123");
        System.out.println("--------------------------------------------------------------");

        UpdateProfileRequest updateProfileRequest =  new UpdateProfileRequest.Builder()
                .firstName("ranju999")
                .lastName("kumari999")
                .email("ranju999@gmail.com")
                .mobileNumber("0987654321")
                .build();

        response = userManagementService.updateProfile(loginResponse.getToken(),updateProfileRequest);
        System.out.println(response.asPrettyString());
        System.out.println("--------------------------------------------------------------");

    }
}
