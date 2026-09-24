package com.miniProjects.communityIssueReporter.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "comment")
public class comment {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    @ManyToOne(optional = false)
    @JoinColumn(name= "issue_id",nullable = false)
    private issue issue;
    private String description;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private User commenter;
    private LocalDate commentDate;

    public comment() {
    }

    public comment(issue issue, String description, User commenter, LocalDate commentDate) {
        this.issue = issue;
        this.description = description;
        this.commenter = commenter;
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

    public User getcommenter() {
        return commenter;
    }

    public void setcommenter(User commenter) {
        this.commenter = commenter;
    }
}
