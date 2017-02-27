package com.company.utils;

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

        switch (type) {

            case MESSAGE: { //tipo mensagem
                JOptionPane.showMessageDialog(component, message, Mensagens.TITULO, JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case CONFIRM: { //tipo confirm
                retorno.setRetorno(String.valueOf(JOptionPane.showConfirmDialog(component, message, Mensagens.TITULO,
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)));
                break;
            }
            case INPUT: {//tipo de pergunta
                //retorno.setRetorno(JOptionPane.showInputDialog(message));
                retorno.setRetorno(JOptionPane.showInputDialog(component, message, Mensagens.TITULO, JOptionPane.PLAIN_MESSAGE));
                break;
            }

        }

    }

}
