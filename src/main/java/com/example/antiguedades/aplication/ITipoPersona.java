package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.TipoPersona;

public interface ITipoPersona {
    Optional<TipoPersona> findById(Long id);
    List<TipoPersona> getAll();
    TipoPersona save(TipoPersona tipoPersona);
    TipoPersona update(Long id, TipoPersona tipoPersona);
    void deleteById(Long id);
}
