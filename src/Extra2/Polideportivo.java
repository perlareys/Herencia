/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra2;

/**
 *
 * @author Perla
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private Instalacion instalacion;

    public Polideportivo(String nombre, Instalacion instalacion, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }
    
    @Override
    public double calcularSuperficie(){
        return largo*ancho;
    }
    
    @Override
    public double calcularVolumen(){
        return largo*ancho*alto;
    }
    
    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
