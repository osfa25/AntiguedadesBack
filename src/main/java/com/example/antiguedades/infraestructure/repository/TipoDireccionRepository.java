package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.TipoDireccion;

public interface TipoDireccionRepository extends JpaRepository<TipoDireccion, Long> {
    
}
