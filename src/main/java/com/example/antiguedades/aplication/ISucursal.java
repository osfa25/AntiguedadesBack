package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Sucursal;

public interface ISucursal {
    Optional<Sucursal> findById(Long id);
    List<Sucursal> getAll();
    Sucursal save(Sucursal sucursal);
    Sucursal update(Long id, Sucursal sucursal);
    void deleteById(Long id);
}
