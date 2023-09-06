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
public class Profesores extends Personal {

    //lenguajes, matemáticas,arquitectura,...
    private String departamento;

    public Profesores(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public void cambioDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public String getInformacion() {
        return super.getInformacion()+ "\n" +
                "Departamento " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
