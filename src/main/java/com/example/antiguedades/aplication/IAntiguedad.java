package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Antiguedad;

public interface IAntiguedad {
    Optional<Antiguedad> findById(Long id);
    List<Antiguedad> getAll();
    Antiguedad save(Antiguedad antiguedad);
    Antiguedad update(Long id,Antiguedad antiguedad);
    void deleteById(Long id); 
}
