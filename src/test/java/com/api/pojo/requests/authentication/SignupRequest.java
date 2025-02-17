package com.api.pojo.requests.authentication;

public class SignupRequest {

    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String mobilenumber;

    public SignupRequest(String username, String password, String email, String firstname, String lastname, String mobilenumber) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobilenumber = mobilenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public static class Builder{
        private String username;
        private String password;
        private String email;
        private String firstname;
        private String lastname;
        private String mobilenumber;

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder email(String email){
            this.password = email;
            return this;
        }

        public Builder firstname(String firstname){
            this.password = firstname;
            return this;
        }

        public Builder lastname(String lastname){
            this.password = lastname;
            return this;
        }

        public Builder mobilenumber(String mobilenumber){
            this.password = mobilenumber;
            return this;
        }

        public SignupRequest build(){
            SignupRequest signupRequest = new SignupRequest(username,password,email, firstname,lastname, mobilenumber);
            return signupRequest;
        }

    }

}
