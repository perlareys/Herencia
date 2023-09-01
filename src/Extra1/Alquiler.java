/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra1;

import java.time.LocalDate;

/**
 *
 * @author Perla
 */
public class Alquiler {

    private String nombre;
    private String documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int amarre;
    private Barco barco;

    public Alquiler(String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int amarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.barco = barco;
    }

    public double calcularAlquiler() {
        long numDias = fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay();
        double moduloTotal = barco.modulo() + barco.moduloEspecial();
        return numDias * moduloTotal;
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{"
                + "nombre=" + nombre
                + ", documento=" + documento
                + ", fechaAlquiler=" + fechaAlquiler
                + ", fechaDevolucion=" + fechaDevolucion
                + ", amarre=" + amarre
                + ", barco=" + barco.toString()
                + '}';
    }

}
