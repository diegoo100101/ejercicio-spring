package com.ejercicio.ejercicio.controller;

import com.ejercicio.ejercicio.model.Material;
import com.ejercicio.ejercicio.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materiales")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> getAllMateriales() {
        return materialService.getAllMateriales();
    }
}
