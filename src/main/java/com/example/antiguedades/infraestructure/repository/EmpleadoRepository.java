package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    
}
