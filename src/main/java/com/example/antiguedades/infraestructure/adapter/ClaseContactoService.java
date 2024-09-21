package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.ClaseContacto;
import com.example.antiguedades.infraestructure.repository.ClaseContactoRepository;

@Service
public class ClaseContactoService {
    @Autowired
    private ClaseContactoRepository claseContactoRepository;

    
    public Optional<ClaseContacto> findById(Long id) {
        return claseContactoRepository.findById(id);
    }

    
    public List<ClaseContacto> getAll() {
        return claseContactoRepository.findAll();
    }

    
    public ClaseContacto save(ClaseContacto claseContacto) {
        return claseContactoRepository.save(claseContacto);
    }

   
    public ClaseContacto update(Long id, ClaseContacto claseContacto) {
        return claseContactoRepository.findById(id)
            .map(existingClase -> {
                existingClase.setNombre(claseContacto.getNombre());
                return claseContactoRepository.save(existingClase);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        claseContactoRepository.deleteById(id);
    }
}
