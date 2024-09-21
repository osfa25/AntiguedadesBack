package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.TipoMovCaja;

public interface ITipoMovCaja {
    Optional<TipoMovCaja> findById(Long id);
    List<TipoMovCaja> getAll();
    TipoMovCaja save(TipoMovCaja tipoMovCaja);
    TipoMovCaja update(Long id, TipoMovCaja tipoMovCaja);
    void deleteById(Long id);
}
