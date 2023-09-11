package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;

public class PizzaHawaiana extends Pizza {

    private String pepperoni;

    public PizzaHawaiana(String name, String pepperoni){
        super(name);
        this.pepperoni = pepperoni;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }
}
