package com.example.application;

import com.example.domaine.Humeur;

public interface IHumeurService {

    void createHumeur(Humeur h);
    Humeur getHumeurById(long id);

}
