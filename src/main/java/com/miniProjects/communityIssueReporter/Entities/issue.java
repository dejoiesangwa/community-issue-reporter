package com.miniProjects.communityIssueReporter.Entities;

import com.miniProjects.communityIssueReporter.enums.issueStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "issue")
public class issue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "citizen_id",nullable = false)
    private users citizen;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private LocalDate dateReported;
    @ManyToOne(optional = false)
    @JoinColumn(name="category_id",nullable = false)
    private category category;
    @Column(nullable = false)
    private String location;
    @Enumerated(EnumType.STRING)
    private issueStatus status = issueStatus.REPORTED;
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private users staff;

    public issue() {
    }

    public issue(String title, users citizen, String description, String location, category category, LocalDate dateReported) {
        this.title = title;
        this.citizen = citizen;
        this.description = description;
        this.category=category;
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

    public users getStaff() {
        return staff;
    }

    public void setStaff(users staff) {
        this.staff = staff;
    }


    public users getCitizen() {
        return citizen;
    }

    public void setCitizen(users citizen) {
        this.citizen = citizen;
    }

    public category getCategory() {
        return category;
    }

    public void setCategory(category category) {
        this.category = category;
    }
}
