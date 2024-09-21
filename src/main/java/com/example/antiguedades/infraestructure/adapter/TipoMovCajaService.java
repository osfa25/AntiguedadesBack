package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.TipoMovCaja;
import com.example.antiguedades.infraestructure.repository.TipoMovCajaRepository;

@Service
public class TipoMovCajaService {
    @Autowired
    private TipoMovCajaRepository tipoMovCajaRepository;

    public Optional<TipoMovCaja> findById(Long id) {
        return tipoMovCajaRepository.findById(id);
    }

    public List<TipoMovCaja> getAll() {
        return tipoMovCajaRepository.findAll();
    }

    
    public TipoMovCaja save(TipoMovCaja tipoMovCaja) {
        return tipoMovCajaRepository.save(tipoMovCaja);
    }

    
    public TipoMovCaja update(Long id, TipoMovCaja tipoMovCaja) {
        return tipoMovCajaRepository.findById(id)
            .map(existingTipo -> {
                existingTipo.setTipo(tipoMovCaja.getTipo());
                return tipoMovCajaRepository.save(existingTipo);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        tipoMovCajaRepository.deleteById(id);
    }
}
