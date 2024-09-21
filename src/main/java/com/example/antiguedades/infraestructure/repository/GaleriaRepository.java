package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Galeria;

public interface GaleriaRepository extends JpaRepository<Galeria, Long> {
    
}
