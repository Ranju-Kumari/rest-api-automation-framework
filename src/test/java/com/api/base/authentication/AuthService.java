package com.api.base.authentication;

import com.api.base.BaseService;
import com.api.pojo.requests.authentication.LoginRequest;
import com.api.pojo.requests.authentication.SignupRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService {

    private static final String BASE_PATH = "/api/auth";

    public Response login(LoginRequest payload){
        return postRequest(payload, BASE_PATH+"/login");
    }

    public Response signup(SignupRequest payload){
        return postRequest(payload,BASE_PATH+"/signup");
    }

    //For forgotPassword, we're not creating POJO class
    // because forgot password has only variable i.e. emailAddress.
    // So, we need not use POJO class for this. Instead we can simply use hashmap for this.
    public Response forgotPassword(String emailAddress){
        HashMap<String, String> payload = new HashMap<String, String>();
        payload.put("email", emailAddress);
        return postRequest(payload, BASE_PATH+"/forgot-password");
    }
}
