package com.api.base.userManagement;

import com.api.base.BaseService;
import io.restassured.response.Response;

public class UserManagementService extends BaseService {

    private static final String BASE_PATH = "/api/users";

    public Response getProfile(String token){
        setAuthToken(token);
        return getRequest(BASE_PATH+ "/profile");
    }

}
