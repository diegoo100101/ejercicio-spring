package com.ejercicio.ejercicio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "formato")
public class Formato implements Serializable {

    @Id
    @Column(name = "id_formato")
    private int idFormato;

    @Column(name = "ds_codigo")
    private String dsCodigo;

    @Column(name = "ds_descripcion")
    private String dsDescripcion;

    @OneToMany(mappedBy = "formato", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MaterialDetalle> detalles;
}
