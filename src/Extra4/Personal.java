/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra4;

/**
 *
 * @author Perla
 */
public class Personal extends Facultad {

    private int anioIncorporacion;
    private int numDespacho;

    public Personal(int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public void cambiarDespacho(int nuevoDespacho) {
        this.numDespacho = nuevoDespacho;
    }

    @Override
    public String toString() {
        return super.getInformacion()+"\n" +
                "Año de incoporació" + anioIncorporacion + "\n" 
                + "Número despacho" + numDespacho;
    }

}
