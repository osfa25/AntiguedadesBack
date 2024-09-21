package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.Categoria;
import com.example.antiguedades.infraestructure.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

   
    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    
    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

 
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

   
    public Categoria update(Long id, Categoria categoria) {
        return categoriaRepository.findById(id)
            .map(existingCategoria -> {
                existingCategoria.setNombre(categoria.getNombre());
                return categoriaRepository.save(existingCategoria);
            })
            .orElse(null);
    }

    
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
