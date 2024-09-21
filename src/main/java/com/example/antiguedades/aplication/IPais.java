package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Pais;

public interface IPais {
    Optional<Pais> findById(Long id);
    List<Pais> getAll();
    Pais save(Pais pais);
    Pais update(Long id, Pais pais);
    void deleteById(Long id);
}
