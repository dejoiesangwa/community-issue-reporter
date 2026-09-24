package com.miniProjects.communityIssueReporter.Repositories;

import com.miniProjects.communityIssueReporter.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
