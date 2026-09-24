package com.miniProjects.communityIssueReporter.Dtos.issueDtos;

public record issueRequestDto(
        String title,
        String description,
        String location
) {
}
