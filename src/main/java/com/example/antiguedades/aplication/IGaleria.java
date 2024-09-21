package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Galeria;

public interface IGaleria {
     Optional<Galeria> findById(Long id);
    List<Galeria> getAll();
    Galeria save(Galeria galeria);
    Galeria update(Long id, Galeria galeria);
    void deleteById(Long id);
}
