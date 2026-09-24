package com.miniProjects.communityIssueReporter.Repositories;

import com.miniProjects.communityIssueReporter.Entities.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepository extends JpaRepository<category,Long> {
}
