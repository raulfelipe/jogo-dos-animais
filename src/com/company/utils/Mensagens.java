package com.company.utils;

/**
 * Classe de mensagens estaticas.
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class Mensagens {

    public static final String TITULO = "Jogo dos Animais";

    public static final String INICIO = "Pense em um animal!";

    public static final String PERGUNTA_INICIAL = "O animal que você pensou vive na água?";

    public static final String PERGUNTA_TUBARAO = "O animal que você pensou é um Tubarão?";

    public static final String PERGUNTA_MACACO = "O animal que você pensou é um Macaco?";

    public static final String TUBARAO = "Tubarão";

    public static final String MACACO = "Macaco";

    public static final String ACERTEI = "Acertei de novo!";

    public static final String PERGUNTA_PENSOU = "Em qual animal você pensou?";

    public static final String UM = "Um(a) ";

    public static final String OUTRO = " ______ mas um(a) ";

    public static final String NAO = " não.";

    public static final String FIM = "Você saiu do jogo!";

    /**
     * Formatando mensagem final.
     * @param retorno
     * @param animal
     * @return String
     */
    public static String formatUmEOutro(String retorno, String animal) {
        retorno = retorno != null ? retorno : "";
        return UM.concat(retorno).concat(OUTRO).concat(animal).concat(NAO);
    }

}
