package com.company.model;

import com.company.controller.Natural;

/**
 * @author Raul Felipe
 * @since 24/Fev/2017
 * @version 1.0.0
 */
public class Animal {

    private String nome;

    private Natural natural;

    private String caracteristica;

    public Animal() {
        this.nome = "";
        this.natural = null;
    }

    public Animal(String nome, Natural natural) {
        this.nome = nome;
        this.natural = natural;
        this.caracteristica = "";
    }

    public void setNome(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

    public Natural getNatural() { return natural; }

    public void setNatural(Natural natural) { this.natural = natural; }

    public String getCaracteristica() { return caracteristica; }

    public void setCaracteristica(String caracteristica) { this.caracteristica = caracteristica; }

}
