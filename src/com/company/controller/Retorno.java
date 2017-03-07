package com.company.controller;

/**
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class Retorno {

    //Atributo
    private String valor;

    //Construtor
    public Retorno() {
        this.valor = "-1";
    }

    //Devolver Retorno
    public String getValor() {
        return valor;
    }

    //Alterar Retorno
    public void setValor(String valor) {
        this.valor = valor;
    }

}
