package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Transaccion;

public interface ITransaccion {
     Optional<Transaccion> findById(Long id);
    List<Transaccion> getAll();
    Transaccion save(Transaccion transaccion);
    Transaccion update(Long id, Transaccion transaccion);
    void deleteById(Long id);
}
