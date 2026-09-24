package com.miniProjects.communityIssueReporter.Dtos.issueDtos;

import com.miniProjects.communityIssueReporter.Entities.User;
import com.miniProjects.communityIssueReporter.Entities.category;
import com.miniProjects.communityIssueReporter.enums.issueStatus;

import java.time.LocalDate;

public record issueResponseDto(
        long id,
        User citizen,
        String description,
        String location,
        LocalDate dateReported,
        category category,
        issueStatus status,
        User staff
) {
}
