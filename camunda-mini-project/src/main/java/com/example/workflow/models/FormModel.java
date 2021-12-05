package com.example.workflow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="project")
public class FormModel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String advisorName;
    private long nbStudent;

    public FormModel(String title, String description, String advisorName, long nbStudent) {
        this.title = title;
        this.description = description;
        this.advisorName = advisorName;
        this.nbStudent = nbStudent;
    }

    public FormModel() {
    }
}
