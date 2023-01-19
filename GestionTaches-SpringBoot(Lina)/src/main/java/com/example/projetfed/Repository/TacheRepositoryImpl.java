package com.example.projetfed.Repository;

import com.example.projetfed.Models.Tache;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public abstract class TacheRepositoryImpl implements TacheRepository {

    @Override
    public List<Tache> findAllByUserID(Long id) {
        return null;
    }

    @Override
    public List<Tache> findAllByProjetID(Long id) {
        return null;
    }


}