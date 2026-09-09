package com.miniProjects.communityIssueReporter.Entities;

import com.miniProjects.communityIssueReporter.enums.issueStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "status_history")
public class statusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    @JoinColumn(name="issue_id")
    private issue issue;
    private issueStatus oldStatus;
    private issueStatus newStatus;
    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;
    private LocalDate dateUpdated;

    public statusHistory(issue issue, issueStatus oldStatus, issueStatus newStatus, User user, LocalDate dateUpdated) {
        this.issue = issue;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.user = user;
        this.dateUpdated = dateUpdated;
    }

    public issue getIssue() {
        return issue;
    }

    public void setIssue(issue issue) {
        this.issue = issue;
    }

    public issueStatus getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(issueStatus oldStatus) {
        this.oldStatus = oldStatus;
    }

    public issueStatus getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(issueStatus newStatus) {
        this.newStatus = newStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
