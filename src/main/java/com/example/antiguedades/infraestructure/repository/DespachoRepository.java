package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Despacho;

public interface DespachoRepository extends JpaRepository<Despacho, Long>{
    
}
