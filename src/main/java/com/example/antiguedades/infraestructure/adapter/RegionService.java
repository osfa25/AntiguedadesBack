package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Region;
import com.example.antiguedades.infraestructure.repository.RegionRepository;

@Service
public class RegionService {
     @Autowired
    private RegionRepository regionRepository;

    public Optional<Region> findById(Long id) {
        return regionRepository.findById(id);
    }

    public List<Region> getAll() {
        return regionRepository.findAll();
    }

    public Region save(Region region) {
        return regionRepository.save(region);
    }

    
    public Region update(Long id, Region region) {
        return regionRepository.findById(id)
            .map(existingRegion -> {
                existingRegion.setNombre(region.getNombre());
                existingRegion.setPais(region.getPais());
                return regionRepository.save(existingRegion);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        regionRepository.deleteById(id);
    }
}
