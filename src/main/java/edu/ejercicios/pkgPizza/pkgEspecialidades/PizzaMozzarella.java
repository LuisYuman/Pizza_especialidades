package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;

public class PizzaMozzarella extends Pizza {

    private String especies;

    public PizzaMozzarella(String name, String especies){
        super(name);
        this.especies = especies;
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }
}
