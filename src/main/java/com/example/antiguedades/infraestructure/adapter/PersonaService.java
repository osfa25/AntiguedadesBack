package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Persona;
import com.example.antiguedades.infraestructure.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona update(Long id, Persona persona) {
        return personaRepository.findById(id)
            .map(existingPersona -> {
                existingPersona.setNombre(persona.getNombre());
                existingPersona.setApellido(persona.getApellido());
                existingPersona.setEmail(persona.getEmail());
                return personaRepository.save(existingPersona);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }
}
