package com.miniProjects.communityIssueReporter.Dtos.UserDtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserRequestDto(
        @NotNull
        String firstName,
        @NotNull
        String lastName,
        @Email
        String email,
        @NotNull
        @Size(min = 4,max = 30)
        String password
) {
}
