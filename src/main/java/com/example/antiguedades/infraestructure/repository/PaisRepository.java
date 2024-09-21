package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long>  {
    
}
