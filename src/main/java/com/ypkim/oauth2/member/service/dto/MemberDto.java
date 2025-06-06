package com.ypkim.oauth2.member.service.dto;

import lombok.Builder;

@Builder
public record MemberDto(
    String username,
    String password) {
}
