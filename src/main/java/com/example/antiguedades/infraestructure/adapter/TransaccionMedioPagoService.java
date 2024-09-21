package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.TransaccionMedioPago;
import com.example.antiguedades.infraestructure.repository.TransaccionMedioPagoRepository;

@Service
public class TransaccionMedioPagoService {
    
    @Autowired
    private TransaccionMedioPagoRepository transaccionMedioPagoRepository;

    public Optional<TransaccionMedioPago> findById(Long id) {
        return transaccionMedioPagoRepository.findById(id);
    }

    
    public List<TransaccionMedioPago> getAll() {
        return transaccionMedioPagoRepository.findAll();
    }

    public TransaccionMedioPago save(TransaccionMedioPago transaccionMedioPago) {
        return transaccionMedioPagoRepository.save(transaccionMedioPago);
    }

    public TransaccionMedioPago update(Long id, TransaccionMedioPago transaccionMedioPago) {
        return transaccionMedioPagoRepository.findById(id)
            .map(existingTransaccion -> {
                existingTransaccion.setMedioPago(transaccionMedioPago.getMedioPago());
                existingTransaccion.setTransaccion(transaccionMedioPago.getTransaccion());
                return transaccionMedioPagoRepository.save(existingTransaccion);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        transaccionMedioPagoRepository.deleteById(id);
    }
}
