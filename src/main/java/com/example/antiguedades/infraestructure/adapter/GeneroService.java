package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Genero;
import com.example.antiguedades.infraestructure.repository.GeneroRepository;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    public Optional<Genero> findById(Long id) {
        return generoRepository.findById(id);
    }

    public List<Genero> getAll() {
        return generoRepository.findAll();
    }

    public Genero save(Genero genero) {
        return generoRepository.save(genero);
    }

    public Genero update(Long id, Genero genero) {
        return generoRepository.findById(id)
            .map(existingGenero -> {
                existingGenero.setNombre(genero.getNombre());
                return generoRepository.save(existingGenero);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        generoRepository.deleteById(id);
    }
}
