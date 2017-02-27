package com.company.jogo;

import com.company.animal.Animal;
import com.company.utils.Mensagens;
import com.company.utils.OpcoesPainel;
import com.company.utils.Retorno;
import com.company.utils.TiposDialogo;

/**
 * Classe para processar o jogo.
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class JogoDosAnimais {

    //Instância de Animal
    private Animal animal;

    //Contrutor.
    public JogoDosAnimais() {
        this.animal = new Animal();
    }

    //Retorno do animal
    public Animal getAnimal() {
        return animal;
    }

    /**
     * Iniciando Jogo
     * @param retorno
     */
    public void iniciar(Retorno retorno) {

        //Criando diálogo inicial
        this.showDialog(TiposDialogo.MESSAGE, Mensagens.INICIO, retorno);

        ///Criando diálogo pergunta inicial
        this.showDialog(TiposDialogo.CONFIRM, Mensagens.PERGUNTA_INICIAL, retorno);

        //Verificando qual escolha foi feita
        this.qual(retorno);

        //Verificando respostas
        this.verifica(retorno);

    }

    /**
     * Verifica qual animal foi escolhido
     * @param retorno
     */
    public void qual(Retorno retorno) {

        //Tratando retorno
        switch (retorno.getRetorno()) {
            case "0": {//Perguntando se foi tubarão?
                this.showDialog(TiposDialogo.CONFIRM, Mensagens.PERGUNTA_TUBARAO, retorno);
                this.getAnimal().setTipo(Mensagens.TUBARAO);
                break;
            }
            case "1": {//Perguntando se foi Macaco?
                this.showDialog(TiposDialogo.CONFIRM, Mensagens.PERGUNTA_MACACO, retorno);
                this.getAnimal().setTipo(Mensagens.MACACO);
                break;
            }
        }

    }

    /**
     * Veriticando respostas
     * @param retorno
     */
    public void verifica(Retorno retorno) {

        //Tratando retorno
        switch (retorno.getRetorno()) {
            case "0": {//Apresentando mensaem de acerto
                this.showDialog(TiposDialogo.MESSAGE, Mensagens.ACERTEI, retorno);
                break;
            }
            case "1":{//Perguntando qual animal pensou
                this.showDialog(TiposDialogo.INPUT, Mensagens.PERGUNTA_PENSOU, retorno);
                this.showDialog(TiposDialogo.INPUT, Mensagens.formatUmEOutro(retorno.getRetorno(),animal.getTipo()), retorno);
                break;
            }
        }

    }

    /**
     * Chamando criador de Panel
     * @param tipo
     * @param mensagem
     * @param retorno
     */
    public void showDialog(TiposDialogo tipo, String mensagem, Retorno retorno) {
        OpcoesPainel.showDialog(tipo, mensagem, retorno);
    }

    /**
     * Finalizando jogo
     * @param retorno
     */
    public void fim(Retorno retorno) {
        OpcoesPainel.showDialog(TiposDialogo.MESSAGE, Mensagens.FIM, retorno);
        System.exit(0);
    }

}