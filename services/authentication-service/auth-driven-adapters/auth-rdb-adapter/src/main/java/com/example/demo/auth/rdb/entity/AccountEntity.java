package com.example.demo.auth.rdb.entity;

import com.example.auth.domain.types.AccountStatus;
import com.example.demo.jpa.support.UuidBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;

import static com.example.demo.auth.rdb.support.AuthRdbConstants.SCHEMA_NAME;
import static com.example.demo.auth.rdb.support.AuthRdbConstants.TB_ACCOUNT;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(
        schema = SCHEMA_NAME,
        name = TB_ACCOUNT
)
public class AccountEntity extends UuidBaseEntity {
    public String username; // 어댑터 모듈을 명확히 구분했기 때문에 public 필드 사용해도 위험 낮고 편의 상승
    public String password;
    public String nickname;

    @Enumerated(EnumType.STRING)
    public AccountStatus status;
    public Instant createdAt;
    public Instant updatedAt;
}