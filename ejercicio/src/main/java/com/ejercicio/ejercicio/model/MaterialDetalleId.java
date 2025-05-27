package com.ejercicio.ejercicio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class MaterialDetalleId implements Serializable {

    @Column(name = "id_material")
    private int idMaterial;

    @Column(name = "id_formato")
    private int idFormato;

    @Override
    public int hashCode(){
        int total = 17;
        int constant = 37;
        total = total * constant + idMaterial;
        total = total * constant + idFormato;
        return total;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (this == object) {
            isEquals = true;
        }
        if (object != null && object.getClass().equals(this.getClass())) {
            MaterialDetalleId that = (MaterialDetalleId) object;
            isEquals = this.idMaterial == that.idMaterial && this.idFormato == that.idFormato;
        }
        return isEquals;
    }
}
