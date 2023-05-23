package com.example.exposition;

import com.example.application.IUtilisateurService;
import com.example.domaine.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UtilisateurController {



    @Autowired
    IUtilisateurService service;
    @PostMapping("/users")
    public void createUser(@RequestBody Utilisateur u){

        service.craateUser(u);

    }

    @GetMapping("/users/{id}")
    public Utilisateur findUserById(@PathVariable Long id){

        return service.getUserById(id);

    }

}
