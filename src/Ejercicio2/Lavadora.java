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
public class Lavadora extends Electrodomestico {

    Scanner leer = new Scanner(System.in);
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingresar capacidad de lavadora:");
        carga = leer.nextInt();
        Lavadora lavadora = new Lavadora(carga, super.getPrecio(), super.getColor(), super.getConsumoEnergetico(), super.getPeso());
        return lavadora;
    }

    private Integer precioFinal(Lavadora lavadora) {
        Integer precioFinal = lavadora.getPrecio();
        if (lavadora.getCarga() > 30) {
            precioFinal += 500;
        }
        //lavadora.setPrecio(precioFinal);
        return precioFinal;
    }

    public String caracteristicas() {
        Integer precioFinal = precioFinal(this);
        return super.caracteristicas() + "\n"
                + "Capacidad          :" + carga + "kg" + "\n"
                + "Precio final       :" + precioFinal;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

}
