package com.miniProjects.communityIssueReporter.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "comment")
public class comment {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    @JoinColumn(name= "issue_id")
    private issue issue;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDate commentDate;

    public comment(issue issue, String description, User user, LocalDate commentDate) {
        this.issue = issue;
        this.description = description;
        this.user = user;
        this.commentDate = commentDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public issue getIssue() {
        return issue;
    }

    public void setIssue(issue issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
        this.commentDate = commentDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
