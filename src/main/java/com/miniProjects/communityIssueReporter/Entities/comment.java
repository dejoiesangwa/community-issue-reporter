package com.miniProjects.communityIssueReporter.Entities;

import jakarta.persistence.*;

@Entity
@Table(name= "comment")
public class comment {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String description;

}
