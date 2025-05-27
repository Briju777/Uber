package com.uber.uberApp.controllers;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.OnBoardDriverDto;
import com.uber.uberApp.dto.SignupDto;
import com.uber.uberApp.dto.UserDto;
import com.uber.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthControlller {

    private final AuthService authService;


    @PostMapping("/signup")
    ResponseEntity<UserDto> signUp(@RequestBody SignupDto signupDto) {
        return new ResponseEntity<>(authService.signup(signupDto), HttpStatus.CREATED);
    }

    @PostMapping("/onBoardDriver")
    ResponseEntity<DriverDto> onBoardDriver(@PathVariable Long userId, @RequestBody OnBoardDriverDto onBoardDriverDto) {
        return new ResponseEntity<>(authService.onboardNewDriver(userId, onBoardDriverDto.getVehchileId()), HttpStatus.CREATED);

    }
}
