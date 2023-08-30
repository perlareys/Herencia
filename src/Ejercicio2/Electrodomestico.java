/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Electrodomestico {

    private double precio;
    private String color;
    private Consumo consumoEnergetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, Consumo consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Consumo getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Consumo consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    } 
    
    Scanner leer = new Scanner(System.in);

    public Consumo comprobarConsumoEnergetico(char letra) {
        for (Consumo aux : Consumo.values()) {
            if (aux.name().equals(String.valueOf(letra))) {
                return aux;
            }
        }
        return Consumo.F;
    }

    public String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};

        for (String aux : colores) {
            if (aux.equals(color.toLowerCase())) {
                return color.toLowerCase();
            }
        }
        return "blanco";
    }

    public Electrodomestico crearElectrodomestico() {

        precio = 1000;
        System.out.println("Ingrese el color del electrodoméstico");
        color = leer.nextLine();
        String comprobar = comprobarColor(color);
        System.out.println("Ingrese el consumo energético (letra entre A y F)");
        char consumo = leer.next().charAt(0);
        Consumo consumoValido = comprobarConsumoEnergetico(consumo);
        System.out.println("Ingresar peso del electrodoméstico");
        peso = leer.nextDouble();

        Electrodomestico electrodomestico = new Electrodomestico(precio, comprobar, consumoValido, peso);
        return electrodomestico;
    }

    public double precioFinal(Electrodomestico electrodomestico) {
        double precioFinal = electrodomestico.getPrecio();

        switch (electrodomestico.getConsumoEnergetico()) {
            case A:
                precioFinal += 1000;
                break;
            case B:
                precioFinal += 800;
                break;
            case C:
                precioFinal += 600;
                break;
            case D:
                precioFinal += 500;
                break;
            case E:
                precioFinal += 300;
                break;
            case F:
                precioFinal += 100;
                break;
        }
        if (electrodomestico.getPeso() >= 1 && electrodomestico.getPeso() <= 19) {
            precioFinal += 100;
        } else if (electrodomestico.getPeso() >= 20 && electrodomestico.getPeso() <= 49) {
            precioFinal += 500;
        } else if (electrodomestico.getPeso() >= 50 && electrodomestico.getPeso() <= 79) {
            precioFinal += 800;
        } else if (electrodomestico.getPeso() >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }

}
