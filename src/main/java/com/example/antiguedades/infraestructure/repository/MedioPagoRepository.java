package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.MedioPago;

public interface MedioPagoRepository extends JpaRepository<MedioPago, Long> {
    
}
