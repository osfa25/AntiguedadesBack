package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Empresa;
import com.example.antiguedades.infraestructure.repository.EmpresaRepository;

@Service
public class EmpresaService {
     
    @Autowired
    private EmpresaRepository empresaRepository;

    
    public Optional<Empresa> findById(Long id) {
        return empresaRepository.findById(id);
    }

    
    public List<Empresa> getAll() {
        return empresaRepository.findAll();
    }

    
    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

   
    public Empresa update(Long id, Empresa empresa) {
        return empresaRepository.findById(id)
            .map(existingEmpresa -> {
                existingEmpresa.setNombre(empresa.getNombre());
                existingEmpresa.setNit(empresa.getNit());
                return empresaRepository.save(existingEmpresa);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        empresaRepository.deleteById(id);
    }
}
