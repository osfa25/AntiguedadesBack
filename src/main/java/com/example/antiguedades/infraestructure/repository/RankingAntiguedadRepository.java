package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.RankingAntiguedad;

public interface RankingAntiguedadRepository extends JpaRepository<RankingAntiguedad, Long> {
    
}
