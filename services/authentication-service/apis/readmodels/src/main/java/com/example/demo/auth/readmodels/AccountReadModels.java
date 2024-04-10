package com.example.demo.auth.readmodels;

import com.example.auth.domain.types.AccountStatus;

public final class AccountReadModels {
    private AccountReadModels() {}

    public record AccountSigningReadModels(
            String password,
            AccountStatus status
    ) {}
}
