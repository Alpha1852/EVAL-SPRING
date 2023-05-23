package com.example.application;

import com.example.domaine.Utilisateur;

public interface IUtilisateurService {

    void craateUser(Utilisateur user);
    Utilisateur getUserById(Long id);

    void suppUser(Long id);

}
