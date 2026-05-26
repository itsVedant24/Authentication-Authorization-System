package com.authsystem.authsystem.controller;


import com.authsystem.authsystem.dto.LoginRequest;
import com.authsystem.authsystem.dto.RegisterRequest;
import com.authsystem.authsystem.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public String register(
            @RequestBody RegisterRequest request) {

        return service.register(request);
    }

    @PostMapping("/login")
    public String login(
            @RequestBody LoginRequest request) {

        return service.login(request);
    }
}