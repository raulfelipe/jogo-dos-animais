package com.company;

import com.company.jogo.JogoDosAnimais;
import com.company.utils.Retorno;

/**
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class Main {

    /**
     * Variável para controlar o FIM
     */
    public static String fim = "-1";

    /**
     * Objeto para controlar o retorno das escolhas
     */
    public static Retorno retorno = new Retorno();

    /**
     * Método para iniciar o jogo dos animais
     * @param args
     */
    public static void main(String[] args) {

        //Criando jogo dos animais
        JogoDosAnimais jogoDosAnimais = new JogoDosAnimais();

        do {

            //iniciando jogo
            jogoDosAnimais.iniciar(retorno);

            //controlando se o jogo finalizou ou se deve reiniciar
        } while (retorno != null &&
                 retorno.getRetorno() != null &&
                 !retorno.getRetorno().equalsIgnoreCase(fim));

        //finalizando jogo
        jogoDosAnimais.fim(retorno);

    }
}
