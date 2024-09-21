package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.ContactoPersona;

public interface ContactoPersonaRepository extends JpaRepository<ContactoPersona, Long>{
    
}
