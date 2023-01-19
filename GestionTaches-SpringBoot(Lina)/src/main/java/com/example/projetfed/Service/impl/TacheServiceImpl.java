package com.example.projetfed.Service.impl;

import com.example.projetfed.Models.Tache;
import com.example.projetfed.Repository.TacheRepository;
import com.example.projetfed.Service.TacheService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TacheServiceImpl implements TacheService {
 private  final TacheRepository tacheRepository;

    public TacheServiceImpl(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }

    @Override
    public List<Tache> findAllTache() {
        return tacheRepository.findAll();
    }

    @Override
    public List<Tache> findAllTacheByUser(Long id) {
        return tacheRepository.findAllByUserID(id);
    }

    @Override
    public List<Tache> findAllTacheByProjet(Long id) {
        return tacheRepository.findAllByProjetID(id);
    }

    @Override
    public Optional<Tache> findbyId(Long Id) {
        return tacheRepository.findById(Id);
    }

    @Override
    public Tache saveTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    @Override
    public Tache updateTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    @Override
    public void deleteTache(Long Id) {
        tacheRepository.deleteById(Id);

    }
}
