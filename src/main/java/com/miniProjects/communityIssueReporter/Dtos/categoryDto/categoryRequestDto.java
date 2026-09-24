package com.miniProjects.communityIssueReporter.Dtos.categoryDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record categoryRequestDto(
         @NotBlank(message = "title required")
         @Size(min = 4)
         String title,
         @NotBlank
         @Size(min= 15)
         String description

) {
}
