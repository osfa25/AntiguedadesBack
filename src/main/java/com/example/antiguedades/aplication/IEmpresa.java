package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Empresa;

public interface IEmpresa {
    Optional<Empresa> findById(Long id);
    List<Empresa> getAll();
    Empresa save(Empresa empresa);
    Empresa update(Long id, Empresa empresa);
    void deleteById(Long id);
}
