package com.example.exposition;

import com.example.application.IActiviteService;
import com.example.application.IUtilisateurService;
import com.example.domaine.Activite;
import com.example.domaine.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActiviteController {

    @Autowired
    IActiviteService service;
    @PostMapping("/activities")
    public void createUser(@RequestBody Activite a){

        service.createActivité(a);

    }

    @GetMapping("/activities/{id}")
   public Activite findActivityById(@PathVariable Long id){

        return service.getActiviteById(id);

   }

}
