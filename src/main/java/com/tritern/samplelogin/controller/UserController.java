package com.tritern.samplelogin.controller;

import com.tritern.samplelogin.dto.ApiResponse;
import com.tritern.samplelogin.dto.LoginDto;
import com.tritern.samplelogin.dto.SignupDto;
import com.tritern.samplelogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ApiResponse signUp(@RequestBody SignupDto signupDto){

        return  userService.signUp(signupDto);
    }

    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }

}
