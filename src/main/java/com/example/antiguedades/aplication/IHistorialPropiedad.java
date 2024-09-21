package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.HistorialPropiedad;

public interface IHistorialPropiedad {
     Optional<HistorialPropiedad> findById(Long id);
    List<HistorialPropiedad> getAll();
    HistorialPropiedad save(HistorialPropiedad historialPropiedad);
    HistorialPropiedad update(Long id, HistorialPropiedad historialPropiedad);
    void deleteById(Long id);
}
