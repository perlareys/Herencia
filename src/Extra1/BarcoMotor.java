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
public class BarcoMotor extends Barco {

    private double potenciaCV;

    public BarcoMotor(double potenciaCV, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double moduloEspecial() {
        double moduloEspecial;
        moduloEspecial = modulo() + potenciaCV;
        return moduloEspecial;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

}
