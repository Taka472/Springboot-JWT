package com.iuh.jwt.Payload;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank
    private String userame;

    @NotBlank
    private String password;
}
