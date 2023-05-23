package com.example.domaine;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Humeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = {CascadeType.MERGE})
    private Utilisateur user;
    private Boolean mood;
    private  String descrption;
    private LocalDate date;

    public Humeur(Utilisateur user, Boolean mood, String descrption, LocalDate date) {
        this.user = user;
        this.mood = mood;
        this.descrption = descrption;
        this.date = date;
    }

    public Humeur() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public Boolean getMood() {
        return mood;
    }

    public void setMood(Boolean mood) {
        this.mood = mood;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
