/*
 * @(#)ClienteRepository.java
 *
 * Copyright 2018, Senior Solution Consultoria em Informática Ltda.
 * http://www.seniorsolution.com.br
 *
 * Todos os direitos reservados.
 */
package com.danepic.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.danepic.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String>
{

}
