package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.PersonaTipoPersona;

public interface IPersonaTipoPersona {
     Optional<PersonaTipoPersona> findById(Long id);
    List<PersonaTipoPersona> getAll();
    PersonaTipoPersona save(PersonaTipoPersona personaTipoPersona);
    PersonaTipoPersona update(Long id, PersonaTipoPersona personaTipoPersona);
    void deleteById(Long id);
}
