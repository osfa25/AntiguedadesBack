package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Sucursal;
import com.example.antiguedades.infraestructure.repository.SucursalRepository;

@Service
public class SucursalService {
    
    @Autowired
    private SucursalRepository sucursalRepository;

    public Optional<Sucursal> findById(Long id) {
        return sucursalRepository.findById(id);
    }

    public List<Sucursal> getAll() {
        return sucursalRepository.findAll();
    }

    public Sucursal save(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    public Sucursal update(Long id, Sucursal sucursal) {
        return sucursalRepository.findById(id)
            .map(existingSucursal -> {
                existingSucursal.setNombre(sucursal.getNombre());
                existingSucursal.setEmpresa(sucursal.getEmpresa());
                return sucursalRepository.save(existingSucursal);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        sucursalRepository.deleteById(id);
    }
}
