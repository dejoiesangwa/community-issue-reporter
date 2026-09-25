package com.miniProjects.communityIssueReporter.Dtos.UserDtos;

import com.miniProjects.communityIssueReporter.enums.role;

public record UserResponseDto(
        long id,
        String firstName,
        String lastName,
        String email,
        role UserRole

) {
}
