package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.ContactoPersona;

public interface IContactoPersona {
     Optional<ContactoPersona> findById(Long id);
    List<ContactoPersona> getAll();
    ContactoPersona save(ContactoPersona contactoPersona);
    ContactoPersona update(Long id, ContactoPersona contactoPersona);
    void deleteById(Long id);
}

