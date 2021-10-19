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
public class ReservaServicioImpl implements ReservaServicio {
    @Autowired
    private ReservaDao reservaDao;

    @Override
    public List<ReservaDto> listarReservas() {
        return (List<ReservaDto>) reservaDao.findAll();
    }

    @Override
    public ReservaDto guardarReserva(ReservaDto reserva) {
        return reservaDao.save(reserva);
    }

    @Override
    public ReservaDto actualizarReserva(ReservaDto reserva) {
        return reservaDao.save(reserva);
    }

    @Override
    public void borrarReserva(ReservaDto reserva) {
        reservaDao.delete(reserva);
    }

    @Override
    public ReservaDto encontrarReservaPorId(ReservaDto reserva) {
        return reservaDao.findById(reserva.getIdReservation()).orElse(null);
    }
    
}
