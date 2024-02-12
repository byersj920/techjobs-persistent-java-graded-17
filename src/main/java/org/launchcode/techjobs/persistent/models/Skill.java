package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    public Skill () {super();}

    public Skill (String description){
        super();
        this.description = description;
    }
}
