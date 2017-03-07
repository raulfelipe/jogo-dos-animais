package com.company.view;

import com.company.controller.Retorno;

import javax.swing.*;
import java.awt.*;

/**
 * Criador de Painel por tipo
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class OpcoesPainel {

    private static Component component = null;

    /**
     * Criador de Dialog.
     * @param type
     * @param message
     * @param retorno
     */
    public static void showDialog(TiposDialogo type, String message, Retorno retorno) {

        String resposta = "";

        switch (type) {

            case MESSAGE: { //tipo mensagem
                resposta = String.valueOf(JOptionPane.showConfirmDialog(component, message, Mensagens.TITULO, JOptionPane.DEFAULT_OPTION));
                break;
            }
            case CONFIRM: { //tipo confirm
                resposta = String.valueOf(JOptionPane.showConfirmDialog(component, message, Mensagens.TITULO,
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
                break;
            }
            case INPUT: {//tipo de pergunta
                resposta = JOptionPane.showInputDialog(component, message, Mensagens.TITULO, JOptionPane.PLAIN_MESSAGE);
                break;
            }

        }

        retorno.setValor(resposta != null ? resposta : "");

    }

}
