package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Coleccionista;
import com.example.antiguedades.infraestructure.repository.ColeccionistaRepository;

@Service
public class ColeccionistaService {
     @Autowired
    private ColeccionistaRepository coleccionistaRepository;

   
    public Optional<Coleccionista> findById(Long id) {
        return coleccionistaRepository.findById(id);
    }

    
    public List<Coleccionista> getAll() {
        return coleccionistaRepository.findAll();
    }

    
    public Coleccionista save(Coleccionista coleccionista) {
        return coleccionistaRepository.save(coleccionista);
    }

    
    public Coleccionista update(Long id, Coleccionista coleccionista) {
        return coleccionistaRepository.findById(id)
            .map(existingColeccionista -> {
                existingColeccionista.setCantidadCompras(coleccionista.getCantidadCompras());
                existingColeccionista.setCantidadCompras(coleccionista.getCantidadCompras());
                existingColeccionista.setPersona(coleccionista.getPersona());
                return coleccionistaRepository.save(existingColeccionista);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        coleccionistaRepository.deleteById(id);
    }
}
