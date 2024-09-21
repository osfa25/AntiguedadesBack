package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.EpocaAntigueda;

public interface IEpoca {
    Optional<EpocaAntigueda> findById(Long id);
    List<EpocaAntigueda> getAll();
    EpocaAntigueda save(EpocaAntigueda antiguedad);
    EpocaAntigueda update(Long id,EpocaAntigueda antiguedad);
    void deleteById(Long id); 
}
