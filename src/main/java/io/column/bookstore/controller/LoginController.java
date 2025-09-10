package io.column.bookstore.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.column.bookstore.service.LoginService;

import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public String login(@RequestBody Map<String, String> credentials) {
        boolean success = loginService.login(credentials.get("username"), credentials.get("password"));
        return success ? "Login Successfully" : "Invalid Credentials Entered";
    }
}
