/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Perla
 */
public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean TDT, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingresar resolución en pulgadas");
        resolucion = leer.nextInt();
        System.out.println("¿Tiene TDT?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        Integer opcion = leer.nextInt();
        if (opcion == 1) {
            TDT = true;
        } else if (opcion == 2) {
            TDT = false;
        }
        Televisor tv = new Televisor(resolucion, TDT, super.getPrecio(), super.getColor(), super.getConsumoEnergetico(), super.getPeso());
        return tv;
    }

    private double precioFinal(Televisor tv) {
        double precioFinal = tv.getPrecio();
        if (tv.getResolucion() > 40) {
            precioFinal *= 1.3;
        }
        if (TDT = true) {
            precioFinal += 500;
        }
        return precioFinal;
    }

    public String caracteristicas() {
        double precioFinal = precioFinal(this);
        return super.caracteristicas() + "\n"
                + "Resolución (pulg.) :" + resolucion + "\n"
                + "Tiene TDT          :" + TDT + "\n"
                + "Precio Final       :" + precioFinal;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

}
