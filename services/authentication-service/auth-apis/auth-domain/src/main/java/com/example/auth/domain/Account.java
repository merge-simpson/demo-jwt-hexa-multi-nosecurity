package com.example.auth.domain;

import com.example.auth.domain.types.AccountStatus;

import java.time.Instant;

public class Account {
    private String id; // ID의 주도성은 도메인 모델이 아니라 DataSource 쪽 Entity에 있음.
    public String username;
    public String password;
    public String nickname;

    public AccountStatus status;
    public Instant createdAt;
    public Instant updatedAt;
}
