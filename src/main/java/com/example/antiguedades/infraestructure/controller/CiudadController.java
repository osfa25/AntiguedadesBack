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

import com.example.antiguedades.aplication.ICiudad;
import com.example.antiguedades.domain.Ciudad;

@RestController
@RequestMapping("/api/ciudades")
public class CiudadController {
    @Autowired
    private ICiudad iCiudad;

    @GetMapping
    public List<Ciudad> list() {
        return iCiudad.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Ciudad> show(@PathVariable Long id) {
        return iCiudad.findById(id);
    }

    @PostMapping
    public ResponseEntity<Ciudad> createCiudad(@RequestBody Ciudad ciudad) {
        return new ResponseEntity<>(iCiudad.save(ciudad), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ciudad> updateCiudad(@PathVariable Long id, @RequestBody Ciudad ciudad) {
        Ciudad updatedCiudad = iCiudad.update(id, ciudad);
        return updatedCiudad != null ? new ResponseEntity<>(updatedCiudad, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCiudad(@PathVariable Long id) {
        if (iCiudad.findById(id).isPresent()) {
            iCiudad.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
