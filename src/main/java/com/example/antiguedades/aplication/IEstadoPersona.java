package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.EstadoPersona;

public interface IEstadoPersona {
    Optional<EstadoPersona> findById(Long id);
    List<EstadoPersona> getAll();
    EstadoPersona save(EstadoPersona estadoPersona);
    EstadoPersona update(Long id, EstadoPersona estadoPersona);
    void deleteById(Long id);
}
