package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.DireccionPersona;
import com.example.antiguedades.infraestructure.repository.DireccionPersonaRepository;

@Service
public class DireccionPersonaService {
     
    @Autowired
    private DireccionPersonaRepository direccionPersonaRepository;

    
    public Optional<DireccionPersona> findById(Long id) {
        return direccionPersonaRepository.findById(id);
    }

    
    public List<DireccionPersona> getAll() {
        return direccionPersonaRepository.findAll();
    }

    public DireccionPersona save(DireccionPersona direccionPersona) {
        return direccionPersonaRepository.save(direccionPersona);
    }

    
    public DireccionPersona update(Long id, DireccionPersona direccionPersona) {
        return direccionPersonaRepository.findById(id)
            .map(existingDireccion -> {
                existingDireccion.setNumero(direccionPersona.getNumero());
                existingDireccion.setTipoDireccion(direccionPersona.getTipoDireccion());
                return direccionPersonaRepository.save(existingDireccion);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        direccionPersonaRepository.deleteById(id);
    }
}
