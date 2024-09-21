package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Persona;

public interface IPersona {
    Optional<Persona> findById(Long id);
    List<Persona> getAll();
    Persona save(Persona persona);
    Persona update(Long id, Persona persona);
    void deleteById(Long id);
}
