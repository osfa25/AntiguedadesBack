package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.TipoTransaccion;

public interface ITipoTransaccion {
     Optional<TipoTransaccion> findById(Long id);
    List<TipoTransaccion> getAll();
    TipoTransaccion save(TipoTransaccion tipoTransaccion);
    TipoTransaccion update(Long id, TipoTransaccion tipoTransaccion);
    void deleteById(Long id);
}
