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

    Scanner leer = new Scanner(System.in);
    private Integer precio;
    private String color;
    private char consumoEnergetico;
    private Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public char comprobarConsumo(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }
        return 'F';
    }

    public String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String aux : colores) {
            if (aux.equals(color.toLowerCase())) {
                return aux;
            }
        }
        return "blanco";
    }

    public Electrodomestico crearElectrodomestico() {
        Integer precioBase = 1000;
        System.out.println("Ingresar color: ");
        color = leer.nextLine();
        System.out.println("Ingresar el consumo energético: (A-F) ");
        char letra = leer.next().charAt(0);
        consumoEnergetico = comprobarConsumo(letra);
        System.out.println("Ingresar peso: ");
        peso = leer.nextInt();
        Electrodomestico electrodomestico = new Electrodomestico(precio, color, consumoEnergetico, peso);
        precioConsumo(electrodomestico);
        precioTamanio(electrodomestico);
        precio= precioBase+precioConsumo(electrodomestico)+precioTamanio(electrodomestico);
        return electrodomestico;
    }

    private Integer precioConsumo(Electrodomestico electrodomestico) {
        Integer finalConsumo = 0;

        switch (electrodomestico.getConsumoEnergetico()) {
            case 'A':
                finalConsumo += 1000;
                break;
            case 'B':
                finalConsumo += 800;
                break;
            case 'C':
                finalConsumo += 600;
                break;
            case 'D':
                finalConsumo += 500;
                break;
            case 'E':
                finalConsumo += 300;
                break;
            case 'F':
                finalConsumo += 100;
                break;
        }
        return finalConsumo;
    }

    private Integer precioTamanio(Electrodomestico electrodomestico) {
        Integer finalTamanio = 0;
        if (electrodomestico.getPeso() >= 1 && electrodomestico.getPeso() <= 19) {
            finalTamanio += 100;
        } else if (electrodomestico.getPeso() >= 20 && electrodomestico.getPeso() <= 49) {
            finalTamanio += 500;
        } else if (electrodomestico.getPeso() >= 50 && electrodomestico.getPeso() <= 79) {
            finalTamanio += 800;
        } else if (electrodomestico.getPeso() >= 80) {
            finalTamanio += 1000;
        }
        return finalTamanio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String caracteristicas() {
        return "Características: " + "\n"
                + "Precio base        :" + "1000" + "\n"
                + "Color              :" + comprobarColor(color) + "\n"
                + "Consumo energético :" + consumoEnergetico + "\n"
                + "Peso               :" + peso + "kg";           
    }

}
