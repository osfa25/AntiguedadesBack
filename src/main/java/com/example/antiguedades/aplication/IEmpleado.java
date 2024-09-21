package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Empleado;

public interface IEmpleado {
    Optional<Empleado> findById(Long id);
    List<Empleado> getAll();
    Empleado save(Empleado empleado);
    Empleado update(Long id, Empleado empleado);
    void deleteById(Long id);
}
