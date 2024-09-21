package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.EpocaAntigueda;

public interface EpocaRepository extends JpaRepository<EpocaAntigueda,Long> {
    
}
