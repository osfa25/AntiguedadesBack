package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Empleado;
import com.example.antiguedades.infraestructure.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    
    public List<Empleado> getAll() {
        return empleadoRepository.findAll();
    }

    
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    
    public Empleado update(Long id, Empleado empleado) {
        return empleadoRepository.findById(id)
            .map(existingEmpleado -> {
                existingEmpleado.setNombre(empleado.getNombre());
                existingEmpleado.setApellido(empleado.getApellido());
                existingEmpleado.setPuesto(empleado.getPuesto());
                return empleadoRepository.save(existingEmpleado);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        empleadoRepository.deleteById(id);
    }
}
