package com.ypkim.oauth2.member.controller;

import com.ypkim.oauth2.member.service.MemberRegistrationService;
import com.ypkim.oauth2.member.service.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberRegistrationController {

    private final MemberRegistrationService service;

    @PostMapping("/member/registration")
    public String post(@ModelAttribute MemberDto dto) {
        log.info("");

        service.register(dto);

        return "redirect:/";
    }
}
