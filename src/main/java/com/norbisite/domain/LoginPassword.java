package com.norbisite.domain;

public class LoginPassword {
    private String password;

    public LoginPassword(String password) {
        this.password = password;
    }

    public LoginPassword() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
