/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centel.ciclo3reto3.controller;

import com.centel.ciclo3reto3.model.ReservaDto;
import com.centel.ciclo3reto3.model.ReservaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author yeison
 */
@RestController
@RequestMapping("/api/Reservation")
public class ControladorReserva {
    @Autowired
    private ReservaServicio reservaServicio;
    
    @GetMapping("/all")
    public List<ReservaDto> apiMostrarReserva(){
        return reservaServicio.listarReservas();
    }

    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ReservaDto apiGuardarReserva(@RequestBody ReservaDto reserva){
        reserva.setStatus("created");
        return reservaServicio.guardarReserva(reserva);
    }
    
}
