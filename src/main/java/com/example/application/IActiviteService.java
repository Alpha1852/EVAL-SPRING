package com.example.application;

import com.example.domaine.Activite;

public interface IActiviteService {

    void createActivité(Activite a);
    Activite getActiviteById(Long id);
    Activite getHappyActivities(Long userId);

    Activite getSadActivities(Long userId);
}
