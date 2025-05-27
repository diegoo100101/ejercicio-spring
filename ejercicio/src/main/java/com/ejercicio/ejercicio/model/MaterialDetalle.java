package com.ejercicio.ejercicio.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "material_detalle")
public class MaterialDetalle implements Serializable {

    @EmbeddedId
    private MaterialDetalleId id;

    @ManyToOne
    @JoinColumn(name = "id_material")
    @MapsId("idMaterial")
    private Material material;

    @ManyToOne
    @JoinColumn(name = "id_formato")
    @MapsId("idFormato")
    private Formato formato;

    @Column(name = "qt_duracion", columnDefinition = "integer default 0")
    private Integer qtDuracion = 0;

    @Column(name = "fg_validado", columnDefinition = "boolean default false")
    private Boolean fgValidado = false;
}
