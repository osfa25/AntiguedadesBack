package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.ClaseContacto;

public interface IClaseContacto {
     Optional<ClaseContacto> findById(Long id);
    List<ClaseContacto> getAll();
    ClaseContacto save(ClaseContacto claseContacto);
    ClaseContacto update(Long id, ClaseContacto claseContacto);
    void deleteById(Long id);
}
