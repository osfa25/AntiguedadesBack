package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Despacho;

public interface IDespacho {
     Optional<Despacho> findById(Long id);
    List<Despacho> getAll();
    Despacho save(Despacho despacho);
    Despacho update(Long id, Despacho despacho);
    void deleteById(Long id);
}
