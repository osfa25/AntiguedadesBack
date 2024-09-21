package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.EstacionPago;

public interface EstacionPagoRepository extends JpaRepository<EstacionPago, Long> {
    
}
