package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Repositories.categoryRepository;
import org.springframework.stereotype.Service;

@Service
public class categoryService {
    private final categoryRepository categoryRepository;

    public categoryService(categoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
