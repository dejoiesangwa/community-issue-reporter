package com.miniProjects.communityIssueReporter.Entities;

import com.miniProjects.communityIssueReporter.enums.category;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "issue")
public class issue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false)
    private String title;
    private String description;
    @Enumerated(EnumType.STRING )
    private category category;
    private LocalDate dateRported;
    private String location;



}
