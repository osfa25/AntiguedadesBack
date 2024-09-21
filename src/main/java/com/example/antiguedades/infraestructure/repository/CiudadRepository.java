package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
}