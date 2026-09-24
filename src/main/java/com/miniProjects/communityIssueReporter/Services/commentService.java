package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Repositories.commentRepository;
import org.springframework.stereotype.Service;

@Service
public class commentService {
    private final commentRepository commentRepository;

    public commentService(commentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
