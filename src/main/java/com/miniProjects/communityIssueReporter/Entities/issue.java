package com.miniProjects.communityIssueReporter.Entities;

import com.miniProjects.communityIssueReporter.enums.issueStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "issue")
public class issue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false,name = "citizen_id")
    private User citizen;
    @Column(nullable = false)
    private String title;
    private String description;
    private LocalDate dateReported;
    private String location;
    @Enumerated(EnumType.STRING)
    private issueStatus status = issueStatus.REPORTED;
    @OneToOne
    @JoinColumn(name = "staff_id")
    private User staff;
    @OneToMany(mappedBy = "issue")
    private List<comment> comments = new ArrayList<>();
    private List<statusHistory> issueStatusHistory = new ArrayList<>();

    public issue(String title,User citizen, String description, String location,LocalDate dateReported) {
        this.title = title;
        this.citizen = citizen;
        this.description = description;
        this.location = location;
        this.dateReported =dateReported;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateReported() {
        return dateReported;
    }

    public void setDateReported(LocalDate dateReported) {
        this.dateReported = dateReported;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public issueStatus getStatus() {
        return status;
    }

    public void setStatus(issueStatus status) {
        this.status = status;
    }

    public User getStaff() {
        return staff;
    }

    public void setStaff(User staff) {
        this.staff = staff;
    }

    public List<comment> getComments() {
        return comments;
    }

    public void AddComments(List<comment> comments) {
        this.comments = comments;
    }

    public User getCitizen() {
        return citizen;
    }

    public void setCitizen(User citizen) {
        this.citizen = citizen;
    }
}
