package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.TransaccionMedioPago;

public interface TransaccionMedioPagoRepository extends JpaRepository<TransaccionMedioPago, Long> {
    
}
