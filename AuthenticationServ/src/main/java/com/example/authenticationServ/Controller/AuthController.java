package com.example.authenticationServ.Controller;

import com.example.authenticationServ.Dto.AuthResponse;
import com.example.authenticationServ.Dto.LoginDTO;
import com.example.authenticationServ.Dto.RegisterDTO;
import com.example.authenticationServ.Service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterDTO dto){
        return authService.register(dto);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginDTO dto) {
        return authService.login(dto);
    }
}
