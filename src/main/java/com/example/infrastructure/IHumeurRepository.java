package com.example.infrastructure;

import com.example.domaine.Humeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHumeurRepository extends JpaRepository<Humeur, Long> {
}
