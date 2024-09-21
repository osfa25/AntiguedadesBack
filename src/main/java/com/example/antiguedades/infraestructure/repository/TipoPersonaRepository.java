package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.TipoPersona;

public interface TipoPersonaRepository extends JpaRepository<TipoPersona, Long>{
    
}
