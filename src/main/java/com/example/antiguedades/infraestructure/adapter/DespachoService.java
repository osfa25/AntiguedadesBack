package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Despacho;
import com.example.antiguedades.infraestructure.repository.DespachoRepository;

@Service
public class DespachoService {
    @Autowired
    private DespachoRepository despachoRepository;

   
    public Optional<Despacho> findById(Long id) {
        return despachoRepository.findById(id);
    }

    
    public List<Despacho> getAll() {
        return despachoRepository.findAll();
    }

    
    public Despacho save(Despacho despacho) {
        return despachoRepository.save(despacho);
    }

    
    public Despacho update(Long id, Despacho despacho) {
        return despachoRepository.findById(id)
            .map(existingDespacho -> {
                existingDespacho.setEstado(despacho.getEstado());
                existingDespacho.setFechaDespacho(despacho.getFechaDespacho());
                existingDespacho.setTransaccion(despacho.getTransaccion());
                return despachoRepository.save(existingDespacho);
            })
            .orElse(null);
    }

   
    public void deleteById(Long id) {
        despachoRepository.deleteById(id);
    }
}
