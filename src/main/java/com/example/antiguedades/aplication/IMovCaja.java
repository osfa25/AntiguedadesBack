package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Movcaja;

public interface IMovCaja {
    Optional<Movcaja> findById(Long id);
    List<Movcaja> getAll();
    Movcaja save(Movcaja movCaja);
    Movcaja update(Long id, Movcaja movCaja);
    void deleteById(Long id);
}
