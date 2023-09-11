package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;

public class PizzaMargarita extends Pizza {

    private String piña;

    public PizzaMargarita(String name, String piña){
        super(name);
        this.piña = piña;
    }

    public String getPiña() {
        return piña;
    }

    public void setPiña(String piña) {
        this.piña = piña;
    }
}
