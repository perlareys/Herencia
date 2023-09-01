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
public class Yates extends Barco {

    private double potenciaCV;
    private int camarotes;

    public Yates(double potenciaCV, int camarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

    @Override
    public double moduloEspecial() {
        double moduloEspecial;
        moduloEspecial = modulo() + potenciaCV + camarotes;
        return moduloEspecial;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

}
