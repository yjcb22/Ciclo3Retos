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
public class ClienteServicioImpl implements ClienteServicio{
    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<ClienteDto> listarClientes() {
        return (List<ClienteDto>) clienteDao.findAll();
    }

    @Override
    public ClienteDto guardarCliente(ClienteDto cliente) {
        return clienteDao.save(cliente);
        
    }

    @Override
    public ClienteDto actualizarCliente(ClienteDto cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public void borrarCliente(ClienteDto cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public ClienteDto encontrarClientePorId(ClienteDto cliente) {
        return clienteDao.findById(cliente.getIdClient()).orElse(null);
    }
    
}
