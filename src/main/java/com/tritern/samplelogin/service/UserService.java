package com.tritern.samplelogin.service;

import com.tritern.samplelogin.dto.ApiResponse;
import com.tritern.samplelogin.dto.LoginDto;
import com.tritern.samplelogin.dto.SignupDto;

public interface UserService {
    ApiResponse signUp(SignupDto signupDto);

    ApiResponse login(LoginDto loginDto);
}
