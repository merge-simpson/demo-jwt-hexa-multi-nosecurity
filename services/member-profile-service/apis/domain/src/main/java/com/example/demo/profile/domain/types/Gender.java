package com.example.demo.profile.domain.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {
    @JsonProperty("m")
    M,
    @JsonProperty("f")
    F
}
