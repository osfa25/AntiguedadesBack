package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.TipoPersona;
import com.example.antiguedades.infraestructure.repository.TipoPersonaRepository;

@Service
public class TipoPersonaService {
    
    @Autowired
    private TipoPersonaRepository tipoPersonaRepository;

    public Optional<TipoPersona> findById(Long id) {
        return tipoPersonaRepository.findById(id);
    }

    public List<TipoPersona> getAll() {
        return tipoPersonaRepository.findAll();
    }

    public TipoPersona save(TipoPersona tipoPersona) {
        return tipoPersonaRepository.save(tipoPersona);
    }

    public TipoPersona update(Long id, TipoPersona tipoPersona) {
        return tipoPersonaRepository.findById(id)
            .map(existingTipo -> {
                existingTipo.setTipo(tipoPersona.getTipo());
                return tipoPersonaRepository.save(existingTipo);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        tipoPersonaRepository.deleteById(id);
    }
}
