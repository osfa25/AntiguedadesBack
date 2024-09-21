package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Antiguedad;

public interface AntiguedadRepository extends JpaRepository<Antiguedad,Long>{
    
}
