package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.EstacionPago;
import com.example.antiguedades.infraestructure.repository.EstacionPagoRepository;

@Service
public class EstacionPagoService {
    
    @Autowired
    private EstacionPagoRepository estacionPagoRepository;

    
    public Optional<EstacionPago> findById(Long id) {
        return estacionPagoRepository.findById(id);
    }

    
    public List<EstacionPago> getAll() {
        return estacionPagoRepository.findAll();
    }

    
    public EstacionPago save(EstacionPago estacionPago) {
        return estacionPagoRepository.save(estacionPago);
    }

    
    public EstacionPago update(Long id, EstacionPago estacionPago) {
        return estacionPagoRepository.findById(id)
            .map(existingEstacion -> {
                existingEstacion.setNombre(estacionPago.getNombre());
                return estacionPagoRepository.save(existingEstacion);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        estacionPagoRepository.deleteById(id);
    }
}
