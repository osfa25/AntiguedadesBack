package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.EpocaAntigueda;
import com.example.antiguedades.infraestructure.repository.EpocaRepository;

@Service
public class EpocaAntiguedaService {
     @Autowired
    private EpocaRepository epocaAntiguedaRepository;

    
    public Optional<EpocaAntigueda> findById(Long id) {
        return epocaAntiguedaRepository.findById(id);
    }

    
    public List<EpocaAntigueda> getAll() {
        return epocaAntiguedaRepository.findAll();
    }

    
    public EpocaAntigueda save(EpocaAntigueda epocaAntigueda) {
        return epocaAntiguedaRepository.save(epocaAntigueda);
    }

    
    public EpocaAntigueda update(Long id, EpocaAntigueda epocaAntigueda) {
        return epocaAntiguedaRepository.findById(id)
            .map(existingEpoca -> {
                existingEpoca.setNombre(epocaAntigueda.getNombre());
                return epocaAntiguedaRepository.save(existingEpoca);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        epocaAntiguedaRepository.deleteById(id);
    }
}
