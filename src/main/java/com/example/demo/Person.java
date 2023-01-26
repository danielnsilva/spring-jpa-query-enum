package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Person implements Serializable {

    @Id
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private EGender gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EGender getGender() {
        return gender;
    }
    
    public void setGender(EGender gender) {
        this.gender = gender;
    }
    
}
