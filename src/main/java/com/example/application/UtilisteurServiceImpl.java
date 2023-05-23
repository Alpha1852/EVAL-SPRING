package com.example.application;

import com.example.domaine.Utilisateur;
import com.example.infrastructure.IUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisteurServiceImpl implements IUtilisateurService{

    @Autowired
    IUtilisateurRepository repoUser;
    @Override
    public void craateUser(Utilisateur user) {
        repoUser.save(user);
    }

    @Override
    public Utilisateur getUserById(Long id) {

        Optional<Utilisateur> optionalUtilisateur=repoUser.findById(id);
        Utilisateur u = null;
        if(optionalUtilisateur.isPresent()){
            u = optionalUtilisateur.get();
            return u;
        }

        return null;
    }

    @Override
    public void suppUser(Long id) {
        //repoUser.delete(id);

    }
}
