/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centel.ciclo3reto3.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yeison
 */
@Service
public class FincaServicioImpl implements FincaServicio {
    @Autowired
    private FincaDao fincaDao;

    @Override
    public List<FincaDto> listarFincas() {
        return (List<FincaDto>) fincaDao.findAll();
    }

    @Override
    public FincaDto guardarFinca(FincaDto finca) {
        return fincaDao.save(finca);
    }

    @Override
    public FincaDto actualizarFinca(FincaDto finca) {
        return fincaDao.save(finca);
    }

    @Override
    public void borrarFinca(FincaDto finca) {
        fincaDao.delete(finca);
    }

    @Override
    public FincaDto encontrarFincaPorId(FincaDto finca) {
        return fincaDao.findById(finca.getId()).orElse(null);
    }
    
}
