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
public class EdificioDeOficinas extends Edificio {

    private String nombre;
    private int numOficionas;
    private int personasPorOficinas;
    private int numPisos;

    public EdificioDeOficinas(String nombre, int numOficionas, int personasPorOficinas, int numPisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.numOficionas = numOficionas;
        this.personasPorOficinas = personasPorOficinas;
        this.numPisos = numPisos;
    }

    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public double calcularVolumen() {
        return largo * ancho * alto;
    }

    public void cantPersonas() {
        int personasPorPiso = personasPorOficinas; //considerar 1 oficina por piso
        System.out.println("En un piso entran: " + personasPorPiso + " personas");
        int totalPersonas = personasPorOficinas * numPisos;
        System.out.println("En todo el edificio entran: " + totalPersonas + " personas");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumOficionas() {
        return numOficionas;
    }

    public void setNumOficionas(int numOficionas) {
        this.numOficionas = numOficionas;
    }

    public int getPersonasPorOficinas() {
        return personasPorOficinas;
    }

    public void setPersonasPorOficinas(int personasPorOficinas) {
        this.personasPorOficinas = personasPorOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
