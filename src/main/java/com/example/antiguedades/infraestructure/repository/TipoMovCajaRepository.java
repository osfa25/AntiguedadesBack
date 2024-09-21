package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.TipoMovCaja;

public interface TipoMovCajaRepository extends JpaRepository<TipoMovCaja, Long> {
    
}
