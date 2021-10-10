package com.tritern.samplelogin.service.impl;

import com.tritern.samplelogin.dto.ApiResponse;
import com.tritern.samplelogin.dto.LoginDto;
import com.tritern.samplelogin.dto.SignupDto;
import com.tritern.samplelogin.entity.User;
import com.tritern.samplelogin.repository.UserDao;
import com.tritern.samplelogin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public ApiResponse signUp(SignupDto signupDto){
        User user = new User();
        BeanUtils.copyProperties(signupDto,user);
        userDao.save(user);
        return new ApiResponse(200, "success", user);
    }

    @Override
    public ApiResponse login(LoginDto loginDto){
        User user = userDao.findByUsername(loginDto.getUsername());
        if (user == null) {
            throw new RuntimeException((loginDto.getUsername()));
            }else
                if (user.getPassword().equals(loginDto.getPassword())) {
            return new ApiResponse(200,"Login Success",null);
        }else
        throw new RuntimeException("Password mismatch.");

        }

}
