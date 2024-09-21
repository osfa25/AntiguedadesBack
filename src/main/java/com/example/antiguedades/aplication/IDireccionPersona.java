package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.DireccionPersona;

public interface IDireccionPersona {
    Optional<DireccionPersona> findById(Long id);
    List<DireccionPersona> getAll();
    DireccionPersona save(DireccionPersona direccionPersona);
    DireccionPersona update(Long id, DireccionPersona direccionPersona);
    void deleteById(Long id);
}
