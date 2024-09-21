package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.DireccionPersona;

public interface DireccionPersonaRepository extends JpaRepository<DireccionPersona, Long>{
    
}
