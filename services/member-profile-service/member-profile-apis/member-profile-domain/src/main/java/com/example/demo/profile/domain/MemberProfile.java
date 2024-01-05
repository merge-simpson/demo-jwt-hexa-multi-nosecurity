package com.example.demo.profile.domain;

import com.example.demo.profile.domain.types.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberProfile {
    public String id;
    public String accountId;
    public String username;
    public String nickname;
    public String gender;
    public String fullName;
    public String email;

    public AccountStatus status;

    public Instant createdAt;
    public Instant updatedAt;
}
