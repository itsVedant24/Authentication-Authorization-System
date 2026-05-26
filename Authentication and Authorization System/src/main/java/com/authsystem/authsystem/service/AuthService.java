package com.authsystem.authsystem.service;

import com.authsystem.authsystem.dto.LoginRequest;
import com.authsystem.authsystem.dto.RegisterRequest;
import com.authsystem.authsystem.entity.User;
import com.authsystem.authsystem.jwt.JwtService;
import com.authsystem.authsystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder;
    private final JwtService jwtService;

    public String register(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());

        user.setPassword(
                encoder.encode(request.getPassword())
        );

        user.setRole("USER");

        repository.save(user);

        return "User Registered Successfully";
    }

    public String login(LoginRequest request) {

        User user = repository
                .findByEmail(request.getEmail())
                .orElseThrow();

        if (!encoder.matches(
                request.getPassword(),
                user.getPassword())) {

            throw new RuntimeException("Invalid Password");
        }

        return jwtService.generateToken(
                user.getEmail()
        );
    }
}