package com.company.utils;

/**
 * Controlar tipo de mensagens
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public enum TiposDialogo {

    MESSAGE(1), CONFIRM(2), INPUT(3);

    public int valor;

    TiposDialogo(int valor) {
        this.valor = valor;
    }

}