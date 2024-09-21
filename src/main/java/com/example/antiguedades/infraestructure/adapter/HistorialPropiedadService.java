package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.HistorialPropiedad;
import com.example.antiguedades.infraestructure.repository.HistorialPropiedadRepository;

@Service
public class HistorialPropiedadService {
    
    private HistorialPropiedadRepository historialPropiedadRepository;

    public Optional<HistorialPropiedad> findById(Long id) {
        return historialPropiedadRepository.findById(id);
    }

    
    public List<HistorialPropiedad> getAll() {
        return historialPropiedadRepository.findAll();
    }

    public HistorialPropiedad save(HistorialPropiedad historialPropiedad) {
        return historialPropiedadRepository.save(historialPropiedad);
    }

    public HistorialPropiedad update(Long id, HistorialPropiedad historialPropiedad) {
        return historialPropiedadRepository.findById(id)
            .map(existingHistorial -> {
                existingHistorial.setAntiguedad(historialPropiedad.getAntiguedad());
                existingHistorial.setFechaCambio(historialPropiedad.getFechaCambio());
                existingHistorial.setPropietarioActual(historialPropiedad.getPropietarioActual());
                existingHistorial.setPropietarioAnterior(historialPropiedad.getPropietarioAnterior());
                return historialPropiedadRepository.save(existingHistorial);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        historialPropiedadRepository.deleteById(id);
    }
}
