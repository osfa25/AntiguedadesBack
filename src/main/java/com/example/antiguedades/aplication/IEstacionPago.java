package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.EstacionPago;

public interface IEstacionPago {
    Optional<EstacionPago> findById(Long id);
    List<EstacionPago> getAll();
    EstacionPago save(EstacionPago estacionPago);
    EstacionPago update(Long id, EstacionPago estacionPago);
    void deleteById(Long id);
}
