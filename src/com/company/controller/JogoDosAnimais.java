package com.company.controller;

import com.company.model.Animal;
import com.company.view.Mensagens;
import com.company.view.OpcoesPainel;
import com.company.view.TiposDialogo;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para controlar o jogo.
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class JogoDosAnimais {

    //Animais da Agua
    private List<Animal> animaisAgua = new ArrayList();

    //Animais da Terra
    private List<Animal> animaisTerra = new ArrayList();;

    //Animal que esta sendo adicionado
    private Animal animal;

    private static final String SIM = "0";
    private static final String NAO = "1";
    private static final String FIM = "-1";

    /**
     * Construtor Controller
     */
    public JogoDosAnimais() {
        animaisAgua.add(new Animal(Mensagens.TUBARAO, Natural.AGUA));
        animaisTerra.add(new Animal(Mensagens.MACACO, Natural.TERRA));
    }

    /**
     * Iniciando Jogo
     * @param retorno
     */
    public boolean iniciar(Retorno retorno) {
        this.showDialog(TiposDialogo.MESSAGE, Mensagens.INICIO, retorno);
        return !retorno.getValor().equals(FIM);
    }

    /**
     * Comando Jogo.
     * @param retorno
     */
    public void comecar(Retorno retorno) {
        this.showDialog(TiposDialogo.CONFIRM, Mensagens.PERGUNTA_INICIAL, retorno);
        this.qualNatureza(retorno);
    }

    /**
     * Verifica qual Anomal foi escolhido
     * @param retorno
     */
    public void qualNatureza(Retorno retorno) {

        Natural natureza = null;
        List<Animal> animais;
        String animal = "";

        if (SIM.equalsIgnoreCase(retorno.getValor())) {
            natureza = Natural.AGUA;
            animais = animaisAgua;
            animal = Mensagens.TUBARAO;
        } else {
            natureza = Natural.TERRA;
            animais = animaisTerra;
            animal = Mensagens.MACACO;
        }

        this.criarAnimal(natureza);
        this.apresentarOpcao(animais, retorno, animal);
        this.verificaRespostas(retorno);

    }

    /**
     * Apresentar Caracteristicas e Animais
     * @param animais
     * @param retorno
     * @param animalPadrao
     */
    private void apresentarOpcao(List<Animal> animais, Retorno retorno, String animalPadrao) {
        for(Animal a : animais ) {
            if (a.getCaracteristica().trim().length() > 0) {
                String mensagem = Mensagens.getPerguntaCaracteristica(a.getCaracteristica());
                this.showDialog(TiposDialogo.CONFIRM, mensagem, retorno);
                if (retorno.getValor().equalsIgnoreCase(SIM)) {
                    this.showDialog(TiposDialogo.CONFIRM, Mensagens.getPergunta(a.getNome()), retorno);
                    if (retorno.getValor().equalsIgnoreCase(SIM)) {
                        break;
                    }
                }
            } else if (a.getNome().equalsIgnoreCase(animalPadrao)) {
                this.showDialog(TiposDialogo.CONFIRM, Mensagens.getPergunta(a.getNome()), retorno);
            }
        }
    }

    /**
     * Veriticando respostas
     * @param retorno
     */
    public void verificaRespostas(Retorno retorno) {
        if (SIM.equalsIgnoreCase(retorno.getValor())) {
            this.showDialog(TiposDialogo.MESSAGE, Mensagens.ACERTEI, retorno);
        } else {
            this.showDialog(TiposDialogo.INPUT, Mensagens.PERGUNTA_PENSOU, retorno);
            this.getAnimal().setNome(retorno.getValor());
            this.showDialog(TiposDialogo.INPUT,
                    Mensagens.getPerguntaCaracteristicaNova(retorno.getValor(),
                            this.getAnimal().getNatural().equals(Natural.AGUA) ?
                                    Mensagens.TUBARAO :
                                    Mensagens.MACACO ),
                    retorno);
            this.getAnimal().setCaracteristica(retorno.getValor());
            this.adicionarAnimal();
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
     * Criar um animal de acordo com sua Natureza (Agua ou Terra)
     * @param natural
     */
    private void criarAnimal(Natural natural) {
        this.animal = new Animal();
        this.animal.setNatural(natural);
    }

    /**
     * Adicionando animal em sua lista de Natureza
     */
    private void adicionarAnimal() {
        if ( this.getAnimal().getNatural().equals(Natural.TERRA) ) {
            this.animaisTerra.add(0, this.getAnimal());
        } else {
            this.animaisAgua.add(0, this.getAnimal());
        }
    }

    /**
     * Finalizando controller
     * @param retorno
     */
    public void finalizar(Retorno retorno) {
        OpcoesPainel.showDialog(TiposDialogo.MESSAGE, Mensagens.FIM, retorno);
        System.exit(0);
    }

    public Animal getAnimal() {
        return animal;
    }

}