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
public class Alojamiento {
    private String nombre;
    private String direccion;
    private String localidad;
    private String gerente;

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
}
