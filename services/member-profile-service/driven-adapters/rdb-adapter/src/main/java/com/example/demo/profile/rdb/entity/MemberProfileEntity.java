package com.example.demo.profile.rdb.entity;

import com.example.demo.jpa.support.UuidBaseEntity;
import com.example.demo.profile.domain.types.AccountStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

import static com.example.demo.profile.rdb.support.MemberProfileRdbConstants.SCHEMA;
import static com.example.demo.profile.rdb.support.MemberProfileRdbConstants.TB_MEMBER_PROFILE;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(
        schema = SCHEMA,
        name = TB_MEMBER_PROFILE
)
public class MemberProfileEntity extends UuidBaseEntity {
    public UUID accountId;
    public String username;
    public String nickname;
    public String gender;
    public String fullName;
    public String email;

    @Enumerated(EnumType.STRING)
    public AccountStatus status;

    @Builder.Default
    public Instant createdAt = Instant.now();
    public Instant updatedAt;
}
