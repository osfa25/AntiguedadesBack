package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.TipoTransaccion;

public interface TipoTransaccionRepository extends JpaRepository<TipoTransaccion, Long> {
    
}
