package com.company.view;

import com.company.controller.Natural;

/**
 * Classe de mensagens estaticas.
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class Mensagens {

    public static final String IDENTIFICADOR = "#ANIMAL#";

    public static final String TITULO = "Jogo dos Animais";

    public static final String INICIO = "Pense em um animal!";

    public static final String PERGUNTA_INICIAL = "O animal que você pensou vive na água?";

    public static final String PERGUNTA_ANIMAL = "O animal que você pensou é #ANIMAL# ?";

    public static final String PERGUNTA_CARACTERISTICA = "O animal que você pensou #ANIMAL# ?";

    public static final String TUBARAO = "Tubarão";

    public static final String MACACO = "Macaco";

    public static final String ACERTEI = "Acertei de novo!";

    public static final String PERGUNTA_PENSOU = "Em qual animal você pensou?";

    public static final String PERGUNTA_CARACTERISTICA_NOVA = "Um(a) #ANIMAL1# ______ mas um(a) #ANIMAL2# não.";

    public static final String FIM = "Você saiu do Jogo!";

    /**
     * Formatando mensagem final.
     * @param retorno
     * @param animal
     * @return String
     */
    public static String getPerguntaCaracteristicaNova(String retorno, String animal) {
        retorno = retorno != null ? retorno : "";
        return PERGUNTA_CARACTERISTICA_NOVA.replace("#ANIMAL1#",retorno).replace("#ANIMAL2#",animal);
    }

    /**
     * Retorna Perginta do animal
     * @param valor
     * @return Pergunta
     */
    public static String getPergunta(String valor) {

        return PERGUNTA_ANIMAL.replace(IDENTIFICADOR, valor);

    }

    /**
     * Retorna Perginta da caracteristica
     * @param valor
     * @return Pergunta
     */
    public static String getPerguntaCaracteristica(String valor) {

        return PERGUNTA_CARACTERISTICA.replace(IDENTIFICADOR, valor);

    }

}
