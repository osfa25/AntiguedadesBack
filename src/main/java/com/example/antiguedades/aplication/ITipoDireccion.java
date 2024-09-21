package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.TipoDireccion;

public interface ITipoDireccion {
    Optional<TipoDireccion> findById(Long id);
    List<TipoDireccion> getAll();
    TipoDireccion save(TipoDireccion tipoDireccion);
    TipoDireccion update(Long id, TipoDireccion tipoDireccion);
    void deleteById(Long id);
}
