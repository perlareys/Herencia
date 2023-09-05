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
public class Hoteles extends Alojamiento {

    private int cantHabitaciones;
    private int numCamas;
    private int cantPisos;
    private double precioHabitacion;
    private Gimnasio tipoGym;
    private String nombreRest;
    private int capacidadRest;

    public Hoteles(int cantHabitaciones, int numCamas, int cantPisos, Gimnasio tipoGym, String nombreRest, int capacidadRest, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.tipoGym = tipoGym;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
        this.precioHabitacion=calcularPrecio();
    }

    private double calcularPrecio() {
        double valorRest = 0;
        double valorGym = 0;
       
        //Valor agregado por restaurante
        if (capacidadRest < 30) {
            valorRest = 10;
        } else if (capacidadRest >= 30 && capacidadRest <= 50) {
            valorRest = 30;
        } else if (capacidadRest > 50) {
            valorRest = 50;
        }

        //Valor agregado por gimnasio
        if (tipoGym == Gimnasio.A) {
            valorGym = 50;
        } else if (tipoGym == Gimnasio.B) {
            valorGym = 30;
        }
        
        return 50 + (1 * cantHabitaciones) + valorRest + valorGym;
    }
    
    public double getPrecio(){
        return precioHabitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public Gimnasio getTipoGym() {
        return tipoGym;
    }

    public void setTipoGym(Gimnasio tipoGym) {
        this.tipoGym = tipoGym;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

}
