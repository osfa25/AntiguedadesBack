package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.DetalleTransaccion;

public interface DetalleTransaccionRepository  extends JpaRepository<DetalleTransaccion, Long> {
    
}
