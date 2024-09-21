package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.antiguedades.domain.Ciudad;
import com.example.antiguedades.infraestructure.repository.CiudadRepository;

public class CiudadService {
    
    @Autowired
    private CiudadRepository ciudadRepository;

   
    public Optional<Ciudad> findById(Long id) {
        return ciudadRepository.findById(id);
    }

 
    public List<Ciudad> getAll() {
        return ciudadRepository.findAll();
    }

    
    public Ciudad save(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

   
    public Ciudad update(Long id, Ciudad ciudad) {
        return ciudadRepository.findById(id)
            .map(existingCiudad -> {
                existingCiudad.setNombre(ciudad.getNombre());
                existingCiudad.setRegion(ciudad.getRegion());
                return ciudadRepository.save(existingCiudad);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        ciudadRepository.deleteById(id);
    }
}
