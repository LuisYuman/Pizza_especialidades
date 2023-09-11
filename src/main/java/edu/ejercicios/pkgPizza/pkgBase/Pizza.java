package edu.ejercicios.pkgPizza.pkgBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pizza {
    private String name;
    private double size;

    private double pbase = 40;

    Scanner scanner = new Scanner(System.in);


    //eliminar la propiedad price de la pizza y
    //crear un metodo que se llame getPizzaPrice
    //haga la sumatoria de los ingredientes y nos de el precio

    //private double price;
    private List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, Topping... toppings) {
        this.name = name;
        //this.price = price;
        //this.pbase = pbase;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    /*public double getPrice() {
        return price;
    }*/

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", price=" +  ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
    }

    public double getPizzaPrice(){
        double price = 0;
        for (Topping topping : toppings) {
            price += topping.getPriceItem();
        }

        pbase = pbase + size;
        price = price + pbase;

        return price;
    }

    public void psize (){

        System.out.println("De que tamaño desea la pizza?");
        System.out.println("1. Pequeña");
        System.out.println("2. Mediana");
        System.out.println("3. Grande");
        int opcion = scanner.nextInt();


        if (opcion == 1) {
            setSize(0);
        } else if (opcion == 2) {
            setSize(4);
        } else if (opcion == 3) {
            setSize(7);
        } else {
            System.out.println("Opcion no valida");
        }

    }




}