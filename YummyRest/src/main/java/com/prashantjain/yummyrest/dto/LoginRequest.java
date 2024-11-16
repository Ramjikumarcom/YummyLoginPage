package com.prashantjain.yummyrest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record LoginRequest(
        @NotNull(message = "Email is required")
        @Email(message = "Email must be in correct format")
        @JsonProperty("email")
        String email,

        @NotNull(message = "Password is required")
        @NotEmpty(message = "Password is required")
        @NotBlank(message = "Password is required")
        @JsonProperty("password")
        String password
) {
}