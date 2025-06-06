package com.ypkim.oauth2.member.service;

import com.ypkim.oauth2.member.domain.Member;
import com.ypkim.oauth2.member.domain.MemberRepository;
import com.ypkim.oauth2.member.service.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberRegistrationService {

    private final MemberRepository repository;

    public Member register(MemberDto dto) {
        log.info("Registration : {}", dto.username());

        var member = new Member();
        member.setUsername(dto.username());
        member.setPassword(dto.password());

        return repository.save(member);
    }
}
