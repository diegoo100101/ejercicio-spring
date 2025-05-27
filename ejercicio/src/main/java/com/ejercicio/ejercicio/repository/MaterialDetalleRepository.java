package com.ejercicio.ejercicio.repository;

import com.ejercicio.ejercicio.model.MaterialDetalle;
import com.ejercicio.ejercicio.model.MaterialDetalleId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialDetalleRepository extends JpaRepository<MaterialDetalle, MaterialDetalleId> {
    List<MaterialDetalle> findByIdIdMaterial(Integer idMaterial);
    List<MaterialDetalle> findByIdIdFormato(Integer idFormato);
}
