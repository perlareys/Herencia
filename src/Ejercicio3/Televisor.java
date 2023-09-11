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
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean TDT;

    public Televisor(double resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(double resolucion, boolean TDT, double precio, String color, Consumo consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public Televisor crearTelevisor() {
        Electrodomestico e2 = crearElectrodomestico();
        System.out.println("Ingresar el tamaño en pulgadas");
        resolucion = leer.nextDouble();
        boolean td = false;
        System.out.println("El televisor cuenta con TDT");
        System.out.println("1. Sí");
        System.out.println("2.No");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            td = true;
        } else if (opcion == 2) {
            td = false;
        }
        Televisor televisor = new Televisor(resolucion, td, e2.getPrecio(), e2.getColor(), e2.getConsumoEnergetico(), e2.getPeso());
        return televisor;
    }

    private Televisor precioFinal(Televisor televisor) {
        double pulgadas = televisor.getResolucion();
        double precio = televisor.getPrecio();
        boolean tdt = televisor.isTDT();

        if (pulgadas > 40) {
            precio *= 1.3;
        }
        if (tdt) {
            precio += 500;
        }
        televisor.setPrecio(precio);
        return televisor;
    }

    @Override
    public String toString() {
        return super.getInformacion() + "\n"
                + "Resolución " + resolucion + "\n"
                + "Posee TDT " + TDT;
    }

}
