/*
 * @(#)Response.java
 *
 * Copyright 2018, Senior Solution Consultoria em Informática Ltda.
 * http://www.seniorsolution.com.br
 *
 * Todos os direitos reservados.
 */
package com.danepic.crud.api.responses;

import java.util.List;

public class Response<T>
{
    private T data;
    private List<String> erros;
    
    public Response(T data)
    {
        this.data = data;
    }
    public Response(List<String> erros )
    {
        this.erros = erros;
    }
    public T getDate( )
    {
        return data;
    }
    public void setDate( T date )
    {
        this.data = date;
    }
    public List<String> getErros( )
    {
        return erros;
    }
    public void setErros( List<String> erros )
    {
        this.erros = erros;
    }
    
    
    
}
