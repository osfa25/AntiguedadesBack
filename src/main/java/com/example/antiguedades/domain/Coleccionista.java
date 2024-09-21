package com.example.antiguedades.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coleccionistas")
public class Coleccionista {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Persona persona;
    @Column(columnDefinition = "INT", nullable = false)
    int cantidadCompras;
    @Column(columnDefinition = "DECIMAL(10,2)", nullable = false)
    double totalCompras;
    public Object getPersona() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersona'");
    }
    public Object getCantidadCompras() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCantidadCompras'");
    }
    public void setCantidadCompras(Object cantidadCompras2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCantidadCompras'");
    }
    public void setPersona(Object persona2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPersona'");
    }
}
