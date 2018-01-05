/*
 * @(#)ClienteServiceImpl.java
 *
 * Copyright 2018, Senior Solution Consultoria em Informática Ltda.
 * http://www.seniorsolution.com.br
 *
 * Todos os direitos reservados.
 */
package com.danepic.crud.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danepic.crud.api.documents.Cliente;
import com.danepic.crud.api.repositories.ClienteRepository;
import com.danepic.crud.api.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService
{

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public List<Cliente> listarTodos( )
    {
        return this.clienteRepository.findAll( );
    }

    @Override
    public Cliente listarPorId( String id )
    {
        return this.clienteRepository.findOne( id );
    }

    @Override
    public Cliente cadastrar( Cliente cliente )
    {
        return this.clienteRepository.save( cliente );
    }

    @Override
    public Cliente atualizar( Cliente cliente )
    {
        return this.clienteRepository.save( cliente );
    }

    @Override
    public void removerPorId( String id )
    {
        this.clienteRepository.delete( id );
    }

}
