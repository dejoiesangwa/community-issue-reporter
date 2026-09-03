package com.miniProjects.communityIssueReporter.Entities;

import com.miniProjects.communityIssueReporter.enums.role;
import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String nationId;
    @OneToOne
    private role role;




}
