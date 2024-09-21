package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Coleccionista;

public interface ColeccionistaRepository extends JpaRepository<Coleccionista, Long> {
    
}
