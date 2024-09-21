package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
