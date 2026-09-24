package com.miniProjects.communityIssueReporter.Dtos.commentDtos;

import com.miniProjects.communityIssueReporter.Entities.User;
import com.miniProjects.communityIssueReporter.Entities.issue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public record commentResponseDto(
         long id,
         issue issue,
         String description,
         User commenter,
         LocalDate commentDate
) {
}
