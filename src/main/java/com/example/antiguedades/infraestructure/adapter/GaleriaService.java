package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Galeria;
import com.example.antiguedades.infraestructure.repository.GaleriaRepository;

@Service
public class GaleriaService {
    
    @Autowired
    private GaleriaRepository galeriaRepository;

    
    public Optional<Galeria> findById(Long id) {
        return galeriaRepository.findById(id);
    }

    
    public List<Galeria> getAll() {
        return galeriaRepository.findAll();
    }

    
    public Galeria save(Galeria galeria) {
        return galeriaRepository.save(galeria);
    }

    public Galeria update(Long id, Galeria galeria) {
        return galeriaRepository.findById(id)
            .map(existingGaleria -> {
                existingGaleria.setAntiguedad(galeria.getAntiguedad());
                existingGaleria.setDescripcion(galeria.getDescripcion());
                existingGaleria.setUrlImagen(galeria.getDescripcion());
                return galeriaRepository.save(existingGaleria);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        galeriaRepository.deleteById(id);
    }
}
