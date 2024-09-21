package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.DetalleTransaccion;
import com.example.antiguedades.infraestructure.repository.DetalleTransaccionRepository;

@Service
public class DetalleTransaccionService {
    
    @Autowired
    private DetalleTransaccionRepository detalleTransaccionRepository;

    
    public Optional<DetalleTransaccion> findById(Long id) {
        return detalleTransaccionRepository.findById(id);
    }

    
    public List<DetalleTransaccion> getAll() {
        return detalleTransaccionRepository.findAll();
    }

    
    public DetalleTransaccion save(DetalleTransaccion detalleTransaccion) {
        return detalleTransaccionRepository.save(detalleTransaccion);
    }

    
    public DetalleTransaccion update(Long id, DetalleTransaccion detalleTransaccion) {
        return detalleTransaccionRepository.findById(id)
            .map(existingDetalle -> {
                existingDetalle.setTransaccion(detalleTransaccion.getTransaccion());
                existingDetalle.setAntiguedad(detalleTransaccion.getAntiguedad());
                return detalleTransaccionRepository.save(existingDetalle);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        detalleTransaccionRepository.deleteById(id);
    }
}
