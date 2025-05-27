package com.ejercicio.ejercicio.service;
import com.ejercicio.ejercicio.model.Material;
import com.ejercicio.ejercicio.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> getAllMateriales() {
        return materialRepository.findAll();
    }

    public Optional<Material> getMaterialById(Integer id) {
        return materialRepository.findById(id);
    }

    public Material saveMaterial(Material material) {
        return materialRepository.save(material);
    }

    public void deleteMaterial(Integer id) {
        materialRepository.deleteById(id);
    }

    public Optional<Material> getMaterialByCodigo(String codigo) {
        return materialRepository.findByDsCodigo(codigo);
    }
}
