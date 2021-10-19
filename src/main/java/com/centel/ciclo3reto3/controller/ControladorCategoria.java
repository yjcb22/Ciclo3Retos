/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centel.ciclo3reto3.controller;

import com.centel.ciclo3reto3.model.CategoriaDto;
import com.centel.ciclo3reto3.model.CategoriaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author yeison
 */
@RestController
@RequestMapping("/api/Category")
public class ControladorCategoria {
    @Autowired
    private CategoriaServicio categoriaServicio;
    
    @GetMapping("/all")
    public List<CategoriaDto> apiMostrarCategoria(){
        return categoriaServicio.listarCategorias();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaDto apiGuardarCategoria(@RequestBody CategoriaDto categoria){
        return categoriaServicio.guardarCategoria(categoria);
    }
    
    
}
