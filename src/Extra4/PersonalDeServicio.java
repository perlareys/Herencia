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
public class PersonalDeServicio extends Personal {

    //biblioteca, decano, secrettaria,...
    private String seccion;

    public PersonalDeServicio(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public void cambioSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }
    
    @Override
    public String getInformacion(){
        return super.getInformacion()+"\n"+
                "Sección " + seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
