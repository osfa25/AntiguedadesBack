package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Categoria;

public interface ICategoria {
     Optional<Categoria> findById(Long id);
    List<Categoria> getAll();
    Categoria save(Categoria categoria);
    Categoria update(Long id, Categoria categoria);
    void deleteById(Long id);
}
