package com.example.antiguedades.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String nombre;
    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String apellido;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String email;


    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;
    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;
    @ManyToOne
    @JoinColumn(name = "estadopersona_id")
    private EstadoPersona estadoPersona;

}
