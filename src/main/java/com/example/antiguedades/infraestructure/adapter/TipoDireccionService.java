package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.TipoDireccion;
import com.example.antiguedades.infraestructure.repository.TipoDireccionRepository;

@Service
public class TipoDireccionService {
    
    @Autowired
    private TipoDireccionRepository tipoDireccionRepository;

    public Optional<TipoDireccion> findById(Long id) {
        return tipoDireccionRepository.findById(id);
    }

    public List<TipoDireccion> getAll() {
        return tipoDireccionRepository.findAll();
    }

    public TipoDireccion save(TipoDireccion tipoDireccion) {
        return tipoDireccionRepository.save(tipoDireccion);
    }

    public TipoDireccion update(Long id, TipoDireccion tipoDireccion) {
        return tipoDireccionRepository.findById(id)
            .map(existingTipo -> {
                existingTipo.setTipo(tipoDireccion.getTipo());
                return tipoDireccionRepository.save(existingTipo);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        tipoDireccionRepository.deleteById(id);
    }
}
