package com.ypkim.oauth2.member.service;

import com.ypkim.oauth2.member.domain.Member;
import com.ypkim.oauth2.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberSecurityService implements UserDetailsService {

    private final MemberRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = repository.findByUsername(username)
                                  .orElseThrow(() -> new UsernameNotFoundException("존재하지 않는 사용자입니다: " + username));

        // Spring Security의 User 객체로 변환
        return User.builder()
                   .username(member.getUsername())
                   .password(member.getPassword())
                   .roles(member.getRole().toString())
                   .build();
    }
}
