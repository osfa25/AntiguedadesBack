package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.HistorialPropiedad;

public interface HistorialPropiedadRepository extends JpaRepository<HistorialPropiedad, Long> {
    
}
