package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.MedioPago;
import com.example.antiguedades.infraestructure.repository.MedioPagoRepository;

@Service
public class MedioPagoService {
    
    @Autowired
    private MedioPagoRepository medioPagoRepository;

    
    public Optional<MedioPago> findById(Long id) {
        return medioPagoRepository.findById(id);
    }

    public List<MedioPago> getAll() {
        return medioPagoRepository.findAll();
    }

    public MedioPago save(MedioPago medioPago) {
        return medioPagoRepository.save(medioPago);
    }

    public MedioPago update(Long id, MedioPago medioPago) {
        return medioPagoRepository.findById(id)
            .map(existingMedio -> {
                existingMedio.setTipo(medioPago.getTipo());
                return medioPagoRepository.save(existingMedio);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        medioPagoRepository.deleteById(id);
    }
}
