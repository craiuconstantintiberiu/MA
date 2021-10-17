package com.ubb.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weapon {
    private String name;
    private String description;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Weapon(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Weapon() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
