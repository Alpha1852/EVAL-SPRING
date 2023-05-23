package com.example.infrastructure;

import com.example.domaine.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActiviteRepository extends JpaRepository<Activite, Long> {
}
