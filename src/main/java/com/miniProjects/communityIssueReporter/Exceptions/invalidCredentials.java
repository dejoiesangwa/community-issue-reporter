package com.miniProjects.communityIssueReporter.Exceptions;

public class invalidCredentials extends RuntimeException {
    public invalidCredentials(String message) {
        super(message);
    }
}
