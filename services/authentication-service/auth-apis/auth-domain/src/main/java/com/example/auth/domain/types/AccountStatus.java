package com.example.auth.domain.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccountStatus {
    @JsonProperty("pending")
    PENDING(false),
    @JsonProperty("active")
    ACTIVE(true),
    @JsonProperty("protected")
    PROTECTED(false),
    @JsonProperty("suspended")
    SUSPENDED(true),
    @JsonProperty("slept")
    SLEPT(false),
    @JsonProperty("removed")
    REMOVED(false);

    private final boolean canSignIn;

    public boolean canSignIn() {
        return canSignIn;
    }
}
