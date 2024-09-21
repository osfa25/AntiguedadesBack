package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.EstadoPersona;

public interface EstadoPersonaRepository extends JpaRepository<EstadoPersona, Long> {
    
}
