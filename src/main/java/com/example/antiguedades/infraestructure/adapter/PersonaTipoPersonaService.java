package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.PersonaTipoPersona;
import com.example.antiguedades.infraestructure.repository.PersonaTipoPersonaRepository;

@Service
public class PersonaTipoPersonaService {
    @Autowired
    private PersonaTipoPersonaRepository personaTipoPersonaRepository;

    public Optional<PersonaTipoPersona> findById(Long id) {
        return personaTipoPersonaRepository.findById(id);
    }

    public List<PersonaTipoPersona> getAll() {
        return personaTipoPersonaRepository.findAll();
    }

    public PersonaTipoPersona save(PersonaTipoPersona personaTipoPersona) {
        return personaTipoPersonaRepository.save(personaTipoPersona);
    }

    public PersonaTipoPersona update(Long id, PersonaTipoPersona personaTipoPersona) {
        return personaTipoPersonaRepository.findById(id)
            .map(existingPersonaTipoPersona -> {
                existingPersonaTipoPersona.setPersona(personaTipoPersona.getPersona());
                existingPersonaTipoPersona.setTipoPersona(personaTipoPersona.getTipoPersona());
                return personaTipoPersonaRepository.save(existingPersonaTipoPersona);
            })
            .orElse(null);
        }
    
        public void deleteById(Long id) {
            personaTipoPersonaRepository.deleteById(id);
        }
}
