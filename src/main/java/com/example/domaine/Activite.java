package com.example.domaine;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Activite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = { CascadeType.MERGE}, fetch = FetchType.EAGER)
    private Utilisateur user;
    private String name;
    private int duration;
    private LocalDate date;

    public Activite(Utilisateur user, String name, int duration, LocalDate date) {
        this.user = user;
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

    public Activite() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
