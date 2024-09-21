package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Antiguedad;
import com.example.antiguedades.infraestructure.repository.AntiguedadRepository;

@Service
public class AntiguedadService {
    @Autowired
    private AntiguedadRepository antiguedadRepository;

    
    public Optional<Antiguedad> findById(Long id) {
        return antiguedadRepository.findById(id);
    }

   
    public List<Antiguedad> getAll() {
        return antiguedadRepository.findAll();
    }

    
    public Antiguedad save(Antiguedad antiguedad) {
        return antiguedadRepository.save(antiguedad);
    }

    
    public Antiguedad update(Long id, Antiguedad antiguedad) {
        return antiguedadRepository.findById(id)
            .map(existingAntiguedad -> {
                existingAntiguedad.setNombre(antiguedad.getNombre());
                existingAntiguedad.setDescripcion(antiguedad.getDescripcion());
                existingAntiguedad.setPrecio(antiguedad.getPrecio());
                existingAntiguedad.setEstadoConservacion(antiguedad.getEstadoConservacion());
                existingAntiguedad.setFechaRegistro(antiguedad.getFechaRegistro());
                existingAntiguedad.setCategoria(antiguedad.getCategoria());
                existingAntiguedad.setPropietario(antiguedad.getPropietario());
                existingAntiguedad.setSucursal(antiguedad.getSucursal());
                existingAntiguedad.setEpocaAntigueda(antiguedad.getEpocaAntigueda());
                return antiguedadRepository.save(existingAntiguedad);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        antiguedadRepository.deleteById(id);
    }
}
