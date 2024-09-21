package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Ciudad;

public interface ICiudad {
     Optional<Ciudad> findById(Long id);
    List<Ciudad> getAll();
    Ciudad save(Ciudad ciudad);
    Ciudad update(Long id, Ciudad ciudad);
    void deleteById(Long id);
}
