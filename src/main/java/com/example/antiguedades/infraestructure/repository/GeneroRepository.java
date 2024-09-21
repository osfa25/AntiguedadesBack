package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
    
}
