/*
 * @(#)ClienteService.java
 *
 * Copyright 2018, Senior Solution Consultoria em Informática Ltda.
 * http://www.seniorsolution.com.br
 *
 * Todos os direitos reservados.
 */
package com.danepic.crud.api.services;

import java.util.List;

import com.danepic.crud.api.documents.Cliente;

public interface ClienteService
{
    List<Cliente> listarTodos();
    
    Cliente listarPorId(String id);
    
    Cliente cadastrar(Cliente cliente);
    
    Cliente atualizar(Cliente cliente);
    
    void removerPorId(String id);
}
