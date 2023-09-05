/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra3;

/**
 *
 * @author Perla
 */
public class Camping extends ExtraHotelero{
    private int capacidadCarpas;
    private int baniosDisponibles;
    private boolean poseeRest;

    public Camping(int capacidadCarpas, int baniosDisponibles, boolean poseeRest, boolean esPrivado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.baniosDisponibles = baniosDisponibles;
        this.poseeRest = poseeRest;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getBaniosDisponibles() {
        return baniosDisponibles;
    }

    public void setBaniosDisponibles(int baniosDisponibles) {
        this.baniosDisponibles = baniosDisponibles;
    }

    public boolean isPoseeRest() {
        return poseeRest;
    }

    public void setPoseeRest(boolean poseeRest) {
        this.poseeRest = poseeRest;
    }
    
    
}
