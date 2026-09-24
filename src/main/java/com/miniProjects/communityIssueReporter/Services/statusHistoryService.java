package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Repositories.statusHistoryRepository;
import org.springframework.stereotype.Service;

@Service
public class statusHistoryService {
    private final statusHistoryRepository statusHistoryRepository;

    public statusHistoryService(statusHistoryRepository statusHistoryRepository) {
        this.statusHistoryRepository = statusHistoryRepository;
    }
}
