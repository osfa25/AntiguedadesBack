package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    
}
