package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Movcaja;
import com.example.antiguedades.infraestructure.repository.MovCajaRepository;

@Service
public class MovCajaService {
    
    @Autowired
    private MovCajaRepository movCajaRepository;

    public Optional<Movcaja> findById(Long id) {
        return movCajaRepository.findById(id);
    }

    public List<Movcaja> getAll() {
        return movCajaRepository.findAll();
    }

    public Movcaja save(Movcaja movCaja) {
        return movCajaRepository.save(movCaja);
    }

    public Movcaja update(Long id, Movcaja movCaja) {
        return movCajaRepository.findById(id)
            .map(existingMovCaja -> {
                existingMovCaja.setTipoMovCaja(movCaja.getTipoMovCaja());
                existingMovCaja.setMonto(movCaja.getMonto());
                existingMovCaja.setFechaMovimiento(movCaja.getFechaMovimiento());
                existingMovCaja.setTipoMovCaja(movCaja.getTipoMovCaja());
                existingMovCaja.setEstacionPago(movCaja.getEstacionPago());
                return movCajaRepository.save(existingMovCaja);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        movCajaRepository.deleteById(id);
    }
}
