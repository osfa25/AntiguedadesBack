package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Movcaja;

public interface MovCajaRepository extends JpaRepository<Movcaja, Long> {
    
}
