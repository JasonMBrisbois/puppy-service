package com.jessicabrisbois.puppyservice;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Puppy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
