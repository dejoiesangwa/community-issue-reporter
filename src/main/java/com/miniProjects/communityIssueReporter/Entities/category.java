package com.miniProjects.communityIssueReporter.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="category")
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String tittle;
    private String description;
    @OneToMany(mappedBy = "category")
    private List<issue> issues = new ArrayList<>();

    public category(String tittle, String description) {
        this.tittle = tittle;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<issue> getIssues() {
        return issues;
    }

    public void setIssues(List<issue> issues) {
        this.issues = issues;
    }
}
