package com.ypkim.oauth2.member.controller;

import ch.qos.logback.core.model.Model;
import com.ypkim.oauth2.member.service.MemberRegistrationService;
import com.ypkim.oauth2.member.service.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class MemberRegistrationController {

    private final MemberRegistrationService service;

    @GetMapping
    public String register(Model model) {
        return "register";
    }

    @PostMapping
    public String post(@ModelAttribute MemberDto dto) {
        log.info("");

        service.register(dto);

        return "redirect:/";
    }
}
