package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
    
}
