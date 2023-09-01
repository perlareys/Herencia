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
public class Velero extends Barco {

    private int numMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    @Override
    public double moduloEspecial() {
        double moduloEspecial;
        moduloEspecial = modulo() + numMastiles;
        return moduloEspecial;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

}
