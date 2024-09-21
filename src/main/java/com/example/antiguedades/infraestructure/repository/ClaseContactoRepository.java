package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.ClaseContacto;

public interface ClaseContactoRepository extends JpaRepository<ClaseContacto, Long> {
}
