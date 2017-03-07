package com.company.main;

import com.company.controller.JogoDosAnimais;
import com.company.controller.Retorno;

/**
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class Main {

    /**
     * Objeto para controlar o retorno das escolhas
     */
    public static Retorno retorno = new Retorno();

    /**
     * Método para iniciar o controller dos animais
     * @param args
     */
    public static void main(String[] args) {

        //Criando controller dos animais
        JogoDosAnimais jogoDosAnimais = new JogoDosAnimais();

        while (jogoDosAnimais.iniciar(retorno)) {
            jogoDosAnimais.comecar(retorno);
        }

        //finalizando controller
        jogoDosAnimais.finalizar(retorno);

    }

}
