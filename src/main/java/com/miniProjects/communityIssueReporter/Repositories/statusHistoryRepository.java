package com.miniProjects.communityIssueReporter.Repositories;

import com.miniProjects.communityIssueReporter.Entities.statusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface statusHistoryRepository extends JpaRepository<statusHistory,Long> {
}
