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
    @ManyToOne(optional = false)
    @JoinColumn(name="issue_id")
    private issue issue;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name="old_status")
    private issueStatus oldStatus;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "new_status")
    private issueStatus newStatus;
    @ManyToOne(optional = false)
    @JoinColumn(name= "user_id")
    private User changedBy;
    private LocalDate dateUpdated;

    public statusHistory() {
    }

    public statusHistory(issue issue, issueStatus oldStatus, issueStatus newStatus, User changedBy, LocalDate dateUpdated) {
        this.issue = issue;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.changedBy = changedBy;
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

    public User getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(User changedBy) {
        this.changedBy = changedBy;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
