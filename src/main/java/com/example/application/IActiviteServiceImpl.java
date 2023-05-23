package com.example.application;

import com.example.domaine.Activite;
import com.example.domaine.Humeur;
import com.example.infrastructure.IActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IActiviteServiceImpl implements IActiviteService{

    @Autowired
    IActiviteRepository repoActivite;
    @Override
    public void createActivité(Activite a) {
        repoActivite.save(a);
    }

    @Override
    public Activite getActiviteById(Long id) {
        Optional<Activite> optionalActivite = repoActivite.findById(id);

        Activite a = null;
        if(optionalActivite.isPresent()){
            a = optionalActivite.get();
            return a;
        }

        return null;
    }

    @Override
    public Activite getHappyActivities(Long userId) {
        return null;
    }

    @Override
    public Activite getSadActivities(Long userId) {
        return null;
    }
}
