package com.uber.uberApp.services.impl;

import com.uber.uberApp.entities.Rider;
import com.uber.uberApp.entities.User;
import com.uber.uberApp.entities.enums.Role;
import com.uber.uberApp.exceptions.RuntimeConflictException;
import com.uber.uberApp.repositories.UserRepository;
import com.uber.uberApp.services.AuthService;
import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.SignupDto;
import com.uber.uberApp.dto.UserDto;
import com.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl  implements AuthService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
       userRepository.findByEmail(signupDto.getEmail()).orElseThrow(()->
                new RuntimeConflictException("Cannot signup, User already exists with email" + signupDto.getEmail()));


        User user = modelMapper.map(signupDto, User.class);
        user.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(user);

        // Create Use related entities
        riderService.createNewRider(user);
        // TODO add wallet realted service here


        return null;
    }

    @Override
    public DriverDto onboardNewDriver(DriverDto driverDto) {
        return null;
    }
}
