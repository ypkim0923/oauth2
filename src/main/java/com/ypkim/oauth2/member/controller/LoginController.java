package com.ypkim.oauth2.member.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class LoginController {

    @GetMapping("/login")
    public String view() {
        return "login";
    }

    @PostMapping("/login")
    public String login() {
        return "login";
    }
}
