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
public class Residencias extends ExtraHotelero {

    private int cantHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Residencias(int cantHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean esPrivado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

}
