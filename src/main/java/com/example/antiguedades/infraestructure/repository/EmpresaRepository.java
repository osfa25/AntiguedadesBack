package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
}
