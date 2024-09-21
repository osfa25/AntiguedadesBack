package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.EstadoPersona;
import com.example.antiguedades.infraestructure.repository.EstadoPersonaRepository;

@Service
public class EstadoPersonaService {
    
    @Autowired
    private EstadoPersonaRepository estadoPersonaRepository;

   
    public Optional<EstadoPersona> findById(Long id) {
        return estadoPersonaRepository.findById(id);
    }

    
    public List<EstadoPersona> getAll() {
        return estadoPersonaRepository.findAll();
    }

    
    public EstadoPersona save(EstadoPersona estadoPersona) {
        return estadoPersonaRepository.save(estadoPersona);
    }

   
    public EstadoPersona update(Long id, EstadoPersona estadoPersona) {
        return estadoPersonaRepository.findById(id)
            .map(existingEstado -> {
                existingEstado.setEstado(estadoPersona.getEstado());
                return estadoPersonaRepository.save(existingEstado);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        estadoPersonaRepository.deleteById(id);
    }
}
