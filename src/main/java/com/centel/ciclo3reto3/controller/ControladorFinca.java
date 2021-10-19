/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centel.ciclo3reto3.controller;

import com.centel.ciclo3reto3.model.FincaDto;
import com.centel.ciclo3reto3.model.FincaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author yeison
 */
@RestController
@RequestMapping("/api/Farm")
public class ControladorFinca {
    @Autowired
    private FincaServicio fincaServicio;
    
    @GetMapping("/all")
    public List<FincaDto> apiMostrarFinca(){
        return fincaServicio.listarFincas();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public FincaDto apiGuardarFinca(@RequestBody FincaDto finca){
        return fincaServicio.guardarFinca(finca);
    }   
}
