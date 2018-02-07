package com.zemoso.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Employee extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    private String firstName;
    private String middleName;
    @NotNull
    private String lastName;

    @NotNull
    private String emailId;
    @NotNull
    private String phoneNo;

    @NotNull
    private String role;
    @NotNull
    private String location;
    @NotNull
    private String joinDate;

    @NotNull
    private String picture;
    @NotNull
    private String bio;
    private String skills;
    @NotNull
    private String department;
    @NotNull
    private String project;

    private String reportEmployee;
}