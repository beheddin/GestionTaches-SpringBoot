package com.example.projetfed.Service;
import com.example.projetfed.Models.Tache;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface TacheService {
    List<Tache> findAllTache();
    List<Tache> findAllTacheByUser(Long id);
    List<Tache> findAllTacheByProjet(Long id);
    Optional<Tache> findbyId(Long Id);
    Tache saveTache(Tache tache);
    Tache updateTache(Tache tache);
    void deleteTache(Long Id);

}
