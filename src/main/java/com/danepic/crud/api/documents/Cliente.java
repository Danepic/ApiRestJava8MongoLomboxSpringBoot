/*
 * @(#)Cliente.java
 *
 * Copyright 2018, Senior Solution Consultoria em Informática Ltda.
 * http://www.seniorsolution.com.br
 *
 * Todos os direitos reservados.
 */
package com.danepic.crud.api.documents;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document
public @Data class Cliente
{   
    @Id
    private @Getter @Setter String id;
    
    private @NotEmpty(message = "Nome não pode ser vazio") @Getter @Setter String nome;
    private @NotEmpty(message = "Email não pode ser vazio") @Email @Getter @Setter String email;
    private @NotEmpty(message = "CPF não pode ser vazio") @CPF(message = "CPF inválido") @Getter @Setter String cpf;
    
    public Cliente() {
    }
}
