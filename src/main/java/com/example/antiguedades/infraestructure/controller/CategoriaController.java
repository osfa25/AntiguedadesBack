package com.example.antiguedades.infraestructure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.antiguedades.aplication.ICategoria;
import com.example.antiguedades.domain.Categoria;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private ICategoria iCategoria;

    @GetMapping
    public List<Categoria> list() {
        return iCategoria.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> show(@PathVariable Long id) {
        return iCategoria.findById(id);
    }

    @PostMapping
    public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
        return new ResponseEntity<>(iCategoria.save(categoria), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria updatedCategoria = iCategoria.update(id, categoria);
        return updatedCategoria != null ? new ResponseEntity<>(updatedCategoria, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long id) {
        if (iCategoria.findById(id).isPresent()) {
            iCategoria.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
