package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Pais;
import com.example.antiguedades.infraestructure.repository.PaisRepository;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;

    public Optional<Pais> findById(Long id) {
        return paisRepository.findById(id);
    }

    
    public List<Pais> getAll() {
        return paisRepository.findAll();
    }

    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

    public Pais update(Long id, Pais pais) {
        return paisRepository.findById(id)
            .map(existingPais -> {
                existingPais.setNombre(pais.getNombre());
                return paisRepository.save(existingPais);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        paisRepository.deleteById(id);
    }
}
