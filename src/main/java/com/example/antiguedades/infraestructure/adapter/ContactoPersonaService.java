package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.ContactoPersona;
import com.example.antiguedades.infraestructure.repository.ContactoPersonaRepository;

@Service
public class ContactoPersonaService {
    
    @Autowired
    private ContactoPersonaRepository contactoPersonaRepository;

    
    public Optional<ContactoPersona> findById(Long id) {
        return contactoPersonaRepository.findById(id);
    }

    
    public List<ContactoPersona> getAll() {
        return contactoPersonaRepository.findAll();
    }

    
    public ContactoPersona save(ContactoPersona contactoPersona) {
        return contactoPersonaRepository.save(contactoPersona);
    }

    
    public ContactoPersona update(Long id, ContactoPersona contactoPersona) {
        return contactoPersonaRepository.findById(id)
            .map(existingContacto -> {
                existingContacto.setNumero(contactoPersona.getNumero());
                existingContacto.setPersona(contactoPersona.getPersona());
                existingContacto.setClaseContacto(contactoPersona.getClaseContacto());
                return contactoPersonaRepository.save(existingContacto);
            })
            .orElse(null);
    }

   
    public void deleteById(Long id) {
        contactoPersonaRepository.deleteById(id);
    }
}
