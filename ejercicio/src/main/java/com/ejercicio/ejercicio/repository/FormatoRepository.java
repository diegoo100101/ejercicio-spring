package com.ejercicio.ejercicio.repository;

import com.ejercicio.ejercicio.model.Formato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FormatoRepository extends JpaRepository<Formato, Integer> {
    Optional<Formato> findByDsCodigo(String dsCodigo);
}
