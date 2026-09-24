package com.miniProjects.communityIssueReporter.Repositories;

import com.miniProjects.communityIssueReporter.Entities.comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface commentRepository extends JpaRepository<comment, Long>{
}
