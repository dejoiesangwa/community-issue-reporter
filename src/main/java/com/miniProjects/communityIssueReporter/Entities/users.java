package com.miniProjects.communityIssueReporter.Entities;

import com.miniProjects.communityIssueReporter.enums.role;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class users {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private role userRole;

    public users() {
    }

    public users(String firstName, String lastName, String email, role userRole) {
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
}
