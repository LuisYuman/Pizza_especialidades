package edu.ejercicios;

import edu.ejercicios.pkgPizza.Interfaces.PizzaBase;
import edu.ejercicios.pkgPizza.pkgBase.Pizza;
import edu.ejercicios.pkgPizza.pkgBase.Topping;
import edu.ejercicios.pkgPizza.pkgEspecialidades.*;

public class Main {
    public static void main(String[] args) {
        /*Pizza pizza = new Pizza("Pepperoni", 12.5);
        pizza.addTopping(new Topping("Tomato"));
        pizza.addTopping(new Topping("Mozerella"));
        pizza.addTopping(new Topping("Basil"));
        pizza.prepare();*/

        /*pizza.removeTopping(1);
        pizza.prepare();

        pizza.addTopping(new Topping("Mozarella"));
        pizza.prepare();*/

        /*PizzaItaliana pizzaItaliana = new PizzaItaliana("Italiana", 15.5, "Ranch");
        pizzaItaliana.addTopping(new Topping("Tomato"));
        pizzaItaliana.addTopping(new Topping("Mozarella"));
        pizzaItaliana.addTopping(new Topping("Basil"));
        pizzaItaliana.prepare();
        System.out.println("Salsa: " + pizzaItaliana.getSalsa());*/

        /*Pizza pizza = new Pizza("Pepperoni");
        pizza.addTopping(new Topping("Tomato", 1.5));
        pizza.addTopping(new Topping("Mozarella", 2.5));
        pizza.addTopping(new Topping("Basil", 1.0));
        System.out.println("El precio de la pizza: " + pizza.getName() + " es: " + pizza.getPizzaPrice());*/

        System.out.println("--------------------------------------------------");

        System.out.println("Bienvenido a la pizzeria");
        PizzaCarnes pizzaCarnes = new PizzaCarnes("Carnes", "Peperoni");
        pizzaCarnes.addTopping(new Topping("Tomato", 1.5));
        pizzaCarnes.psize();
        pizzaCarnes.prepare();
        pizzaCarnes.getPizzaPrice();

        System.out.println("--------------------------------------------------");

        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana("Hawaiana", "Piña");
        pizzaHawaiana.addTopping(new Topping("Tomato", 1.5));
        pizzaHawaiana.psize();
        pizzaHawaiana.prepare();
        pizzaHawaiana.getPizzaPrice();

        System.out.println("--------------------------------------------------");

        PizzaMargarita pizzaMargarita = new PizzaMargarita("Margarita", "Queso");
        pizzaMargarita.addTopping(new Topping("Tomato", 1.5));
        pizzaMargarita.psize();
        pizzaMargarita.prepare();
        pizzaMargarita.getPizzaPrice();

        System.out.println("--------------------------------------------------");

        PizzaMozzarella pizzaMozzarella = new PizzaMozzarella("Mozzarella", "Queso");
        pizzaMozzarella.addTopping(new Topping("Tomato", 1.5));
        pizzaMozzarella.psize();
        pizzaMozzarella.prepare();
        pizzaMozzarella.getPizzaPrice();

        System.out.println("--------------------------------------------------");

        System.out.println("El precio de la pizza: " + pizzaCarnes.getName() + " es: " + pizzaCarnes.getPizzaPrice());
        System.out.println("El precio de la pizza: " + pizzaHawaiana.getName() + " es: " + pizzaHawaiana.getPizzaPrice());
        System.out.println("El precio de la pizza: " + pizzaMargarita.getName() + " es: " + pizzaMargarita.getPizzaPrice());
        System.out.println("El precio de la pizza: " + pizzaMozzarella.getName() + " es: " + pizzaMozzarella.getPizzaPrice());


    }
}