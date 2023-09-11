package edu.ejercicios.pkgPizza.pkgEspecialidades;

import edu.ejercicios.pkgPizza.pkgBase.Pizza;
import edu.ejercicios.pkgPizza.pkgBase.Topping;

public class PizzaCarnes extends Pizza {

    private String queso;

    public PizzaCarnes(String name, String queso, Topping... toppings){
        super(name, toppings);
        this.queso = queso;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }
}
