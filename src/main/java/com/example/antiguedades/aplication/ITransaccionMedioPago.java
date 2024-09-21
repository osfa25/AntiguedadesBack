package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.TransaccionMedioPago;

public interface ITransaccionMedioPago {
    Optional<TransaccionMedioPago> findById(Long id);
    List<TransaccionMedioPago> getAll();
    TransaccionMedioPago save(TransaccionMedioPago transaccionMedioPago);
    TransaccionMedioPago update(Long id, TransaccionMedioPago transaccionMedioPago);
    void deleteById(Long id);
}
