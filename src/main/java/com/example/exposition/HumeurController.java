package com.example.exposition;

import com.example.application.IHumeurService;
import com.example.application.IUtilisateurService;
import com.example.domaine.Humeur;
import com.example.domaine.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HumeurController {


    @Autowired
    IHumeurService service;
    @PostMapping("/moods")
    public void createHumeur(@RequestBody Humeur h){

        service.createHumeur(h);

    }

    @GetMapping("/moods/{id}")
    public Humeur findHumeurById(@PathVariable Long id){

        return service.getHumeurById(id);

    }

}
