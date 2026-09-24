package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository UserRepository;

    public UserService(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
    }
}
