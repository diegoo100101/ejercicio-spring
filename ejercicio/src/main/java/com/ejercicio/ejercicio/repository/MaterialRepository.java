package com.ejercicio.ejercicio.repository;

import com.ejercicio.ejercicio.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
    Optional<Material> findByDsCodigo(String dsCodigo);
}
