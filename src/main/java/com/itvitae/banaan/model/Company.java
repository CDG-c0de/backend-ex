package com.itvitae.banaan.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @NonNull
    private Long amtEmployees;
    @OneToMany(mappedBy = "company")
    private Set<User> users = new HashSet<>();

    public Company() {
    }

    public Company(String name, Long amtEmployees) {
        this.name = name;
        this.amtEmployees = amtEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmtEmployees(Long amtEmployees) {
        this.amtEmployees = amtEmployees;
    }

    public String getName() {
        return name;
    }

    public Long getAmtEmployees() {
        return amtEmployees;
    }
}
