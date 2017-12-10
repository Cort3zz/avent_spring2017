package com.norbisite.domain;

public class MessagePassword {
    private String password;

    public MessagePassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public MessagePassword() {
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
