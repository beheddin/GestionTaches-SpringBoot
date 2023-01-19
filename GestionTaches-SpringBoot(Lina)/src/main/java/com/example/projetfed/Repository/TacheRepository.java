package com.example.projetfed.Repository;

import com.example.projetfed.Models.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TacheRepository extends JpaRepository<Tache,Long> {
    List<Tache> findAllByUserID(Long id);

   List<Tache> findAllByProjetID(Long id);
}
