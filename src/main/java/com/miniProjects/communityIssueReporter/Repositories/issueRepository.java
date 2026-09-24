package com.miniProjects.communityIssueReporter.Repositories;

import com.miniProjects.communityIssueReporter.Entities.issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface issueRepository extends JpaRepository<issue, Long> {
}
