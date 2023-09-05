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
public class ExtraHotelero extends Alojamiento{
    private boolean esPrivado;
    private double metrosCuadrados;

    public ExtraHotelero(boolean esPrivado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
}
