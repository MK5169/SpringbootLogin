package com.tritern.samplelogin.dto;

import static com.tritern.samplelogin.PasswordHashing.doHashing;

public class LoginDto {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return doHashing(password);
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }
}
