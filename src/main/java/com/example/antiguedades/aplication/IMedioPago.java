package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.MedioPago;

public interface IMedioPago {
     Optional<MedioPago> findById(Long id);
    List<MedioPago> getAll();
    MedioPago save(MedioPago medioPago);
    MedioPago update(Long id, MedioPago medioPago);
    void deleteById(Long id);
}
