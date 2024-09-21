package com.example.antiguedades.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.antiguedades.domain.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
    
}
