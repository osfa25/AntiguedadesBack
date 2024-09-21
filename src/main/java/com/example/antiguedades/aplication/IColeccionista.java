package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Coleccionista;

public interface IColeccionista {
    Optional<Coleccionista> findById(Long id);
    List<Coleccionista> getAll();
    Coleccionista save(Coleccionista coleccionista);
    Coleccionista update(Long id, Coleccionista coleccionista);
    void deleteById(Long id);
}
