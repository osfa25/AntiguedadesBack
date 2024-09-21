package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Genero;

public interface IGenero {
    Optional<Genero> findById(Long id);
    List<Genero> getAll();
    Genero save(Genero genero);
    Genero update(Long id, Genero genero);
    void deleteById(Long id);
}
