package com.ejercicio.ejercicio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "material")
public class Material implements Serializable {

    @Id
    @Column(name = "id_material")
    private int idMaterial;

    @Column(name = "ds_codigo")
    private String dsCodigo;

    @ManyToOne
    @JoinColumn(name = "id_dependencia")
    private Material dependencia;
}
