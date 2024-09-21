package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Transaccion;
import com.example.antiguedades.infraestructure.repository.TransaccionRepository;

@Service
public class TransaccionService {
    
    @Autowired
    private TransaccionRepository transaccionRepository;

    public Optional<Transaccion> findById(Long id) {
        return transaccionRepository.findById(id);
    }

    public List<Transaccion> getAll() {
        return transaccionRepository.findAll();
    }

    public Transaccion save(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public Transaccion update(Long id, Transaccion transaccion) {
        return transaccionRepository.findById(id)
            .map(existingTransaccion -> {
                existingTransaccion.setFecha(transaccion.getFecha());
                existingTransaccion.setMonto(transaccion.getMonto());
                existingTransaccion.setComprador(transaccion.getComprador());
                existingTransaccion.setVendedor(transaccion.getVendedor());
                return transaccionRepository.save(existingTransaccion);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        transaccionRepository.deleteById(id);
    }
}
