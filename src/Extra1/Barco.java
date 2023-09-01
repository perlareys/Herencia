/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra1;

/**
 *
 * @author Perla
 */
public abstract class Barco {

    private String matricula;
    private double eslora;
    private int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public double modulo() {
        return eslora * 10;
    }

    public abstract double moduloEspecial();

    //Getter y setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{"
                + "matricula=" + matricula
                + ", eslora=" + eslora
                + ", anioFabricacion=" + anioFabricacion
                + '}';
    }

}
