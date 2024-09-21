package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.TipoTransaccion;
import com.example.antiguedades.infraestructure.repository.TipoTransaccionRepository;

@Service
public class TipoTransaccionService {
    
    @Autowired
    private TipoTransaccionRepository tipoTransaccionRepository;

    public Optional<TipoTransaccion> findById(Long id) {
        return tipoTransaccionRepository.findById(id);
    }

    public List<TipoTransaccion> getAll() {
        return tipoTransaccionRepository.findAll();
    }

    
    public TipoTransaccion save(TipoTransaccion tipoTransaccion) {
        return tipoTransaccionRepository.save(tipoTransaccion);
    }

    public TipoTransaccion update(Long id, TipoTransaccion tipoTransaccion) {
        return tipoTransaccionRepository.findById(id)
            .map(existingTipo -> {
                existingTipo.setTipo(tipoTransaccion.getTipo());
                return tipoTransaccionRepository.save(existingTipo);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        tipoTransaccionRepository.deleteById(id);
    }
}
