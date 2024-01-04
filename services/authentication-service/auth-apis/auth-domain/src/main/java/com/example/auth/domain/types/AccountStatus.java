package com.example.auth.domain.types;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccountStatus {
    PENDING(false),
    ACTIVE(true),
    PROTECTED(false),
    SUSPENDED(true),
    SLEPT(false),
    REMOVED(false);

    private final boolean canSignIn;

    public boolean canSignIn() {
        return canSignIn;
    }
}
