package com.uber.uberApp.services.impl;

import com.uber.uberApp.services.AuthService;
import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.SignupDto;
import com.uber.uberApp.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl  implements AuthService {
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(DriverDto driverDto) {
        return null;
    }
}
