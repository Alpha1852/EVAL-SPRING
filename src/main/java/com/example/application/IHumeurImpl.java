package com.example.application;

import com.example.domaine.Humeur;
import com.example.infrastructure.IHumeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IHumeurImpl implements IHumeurService{

    @Autowired
    IHumeurRepository repoHumeur;
    @Override
    public void createHumeur(Humeur h) {
        repoHumeur.save(h);
    }

    @Override
    public Humeur getHumeurById(long id) {
        Optional<Humeur> optionalHumeur = repoHumeur.findById(id);

        Humeur h = null;
        if(optionalHumeur.isPresent()){
            h = optionalHumeur.get();
            return h;
        }

        return null;
    }
}
