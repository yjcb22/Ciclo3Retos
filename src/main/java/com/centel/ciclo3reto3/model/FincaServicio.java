/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centel.ciclo3reto3.model;

import java.util.List;

/**
 *
 * @author yeison
 */
public interface FincaServicio {    
    public List<FincaDto> listarFincas();
    public FincaDto guardarFinca(FincaDto finca);
    public FincaDto actualizarFinca(FincaDto finca);
    public void borrarFinca(FincaDto finca);
    public FincaDto encontrarFincaPorId(FincaDto finca);    
}
