package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.DetalleTransaccion;

public interface IDetalleTransaccion {
    
    Optional<DetalleTransaccion> findById(Long id);
    List<DetalleTransaccion> getAll();
    DetalleTransaccion save(DetalleTransaccion detalleTransaccion);
    DetalleTransaccion update(Long id, DetalleTransaccion detalleTransaccion);
    void deleteById(Long id);
}
