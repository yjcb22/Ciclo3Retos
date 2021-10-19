/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centel.ciclo3reto3.controller;

import com.centel.ciclo3reto3.model.ClienteDto;
import com.centel.ciclo3reto3.model.ClienteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yeison
 */
@RestController
@RequestMapping("/api/Client")
public class ControladorCliente {
    @Autowired
    private ClienteServicio clienteServicio;
    
    @GetMapping("/all")
    public List<ClienteDto> apiMostrarCliente(){
        return clienteServicio.listarClientes();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDto apiGuardarCliente(@RequestBody ClienteDto cliente){
        return clienteServicio.guardarCliente(cliente);
    }
    
    
}
