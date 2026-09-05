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
    @OneToOne
    @JoinColumn(name= "user_id")
    private User statusUpdater;
    private LocalDate dateUpdated;

    public statusHistory(issue issue, issueStatus oldStatus, issueStatus newStatus, User statusUpdater, LocalDate dateUpdated) {
        this.issue = issue;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.statusUpdater = statusUpdater;
        this.dateUpdated = dateUpdated;
    }
}
