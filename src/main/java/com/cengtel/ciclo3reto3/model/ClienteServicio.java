/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cengtel.ciclo3reto3.model;

import java.util.List;

/**
 *
 * @author yeison
 */
public interface ClienteServicio {
    public List<ClienteDto> listarClientes();
    public ClienteDto guardarCliente(ClienteDto cliente);
    public ClienteDto actualizarCliente(ClienteDto cliente);
    public boolean borrarCliente(ClienteDto cliente);
    public ClienteDto encontrarClientePorId(ClienteDto cliente);    
    
}
