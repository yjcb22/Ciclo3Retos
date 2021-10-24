/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cengtel.ciclo3reto3.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yeison
 */
@Service
public class MensajeServicioImpl implements MensajeServicio {
    @Autowired
    private MensajeDao mensajeDao;

    @Override
    public List<MensajeDto> listarMensajes() {
        return (List<MensajeDto>) mensajeDao.findAll();
    }

    @Override
    public MensajeDto guardarMensaje(MensajeDto mensaje) {
        return mensajeDao.save(mensaje);
    }

    @Override
    public MensajeDto actualizarMensaje(MensajeDto mensaje) {
        return mensajeDao.save(mensaje);
    }

    @Override
    public boolean borrarMensaje(MensajeDto message) {
       MensajeDto mensaje = mensajeDao.findById(message.getIdMessage()).orElse(null);
        if (mensaje != null) {
            mensajeDao.delete(mensaje);
            return true;
        } else{
            return false;
        }        
    }

    @Override
    public MensajeDto encontrarMensajePorId(MensajeDto mensaje) {
        return mensajeDao.findById(mensaje.getIdMessage()).orElse(null);
    }
    
}
