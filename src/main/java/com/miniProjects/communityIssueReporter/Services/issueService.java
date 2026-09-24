package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Repositories.issueRepository;
import org.springframework.stereotype.Service;

@Service
public class issueService {
    private final issueRepository issueRepository;

    public issueService(issueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }
}
