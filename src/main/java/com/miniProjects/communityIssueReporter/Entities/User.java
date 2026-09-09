package com.miniProjects.communityIssueReporter.Entities;

import com.miniProjects.communityIssueReporter.enums.role;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true)
    private String email;
    @OneToOne
    @JoinColumn(nullable = false)
    @Enumerated(EnumType.STRING)
    private role userRole;
    @OneToMany(mappedBy = "staff")
    private List<issue> issuesAssigned = new ArrayList<>();
    @OneToMany(mappedBy = "citizen")
    private List<issue> issuesReported = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<comment> comments = new ArrayList<>();

    public User(String firstName, String lastName, String email, role userRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userRole = userRole;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public role getUserRole() {
        return userRole;
    }

    public void setUserRole(role userRole) {
        this.userRole = userRole;
    }

    public List<comment> getComments() {
        return comments;
    }

    public void setComments(List<comment> comments) {
        this.comments = comments;
    }

    public List<issue> getIssuesReported() {
        return issuesReported;
    }

    public void setIssuesReported(List<issue> issuesReported) {
        this.issuesReported = issuesReported;
    }

    public List<issue> getIssuesAssigned() {
        return issuesAssigned;
    }

    public void setIssuesAssigned(List<issue> issuesAssigned) {
        this.issuesAssigned = issuesAssigned;
    }
}
