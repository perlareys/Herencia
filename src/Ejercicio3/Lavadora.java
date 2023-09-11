/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Perla
 */
public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora(double carga) {
        super();
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, Consumo consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Electrodomestico e = crearElectrodomestico();
        System.out.println("Ingresar la carga de la lavadora");
        carga = leer.nextDouble();
        Lavadora lavadora = new Lavadora(carga, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        return precioFinal(lavadora);
    }

    private Lavadora precioFinal(Lavadora lavadora) {
        double precio = lavadora.getPrecio();
        double carga = lavadora.getCarga();

        if (carga > 30) {
            precio += 500;
        }
        lavadora.setPrecio(precio);
        return lavadora;
    }
}
