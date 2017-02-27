package com.company.animal;

/**
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class Animal {

    //Tipo de Animal
    private String tipo;

    //Construtor
    public Animal() {
        tipo = "";
    }

    //Construtor recebendo tipo
    public Animal(String tipo) {
        this.tipo = tipo;
    }

    //Alterando tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Retornando tipo
    public String getTipo() {
        return this.tipo;
    }

}
