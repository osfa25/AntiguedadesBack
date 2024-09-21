package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.Region;

public interface IRegion {
    Optional<Region> findById(Long id);
    List<Region> getAll();
    Region save(Region region);
    Region update(Long id, Region region);
    void deleteById(Long id);
}
