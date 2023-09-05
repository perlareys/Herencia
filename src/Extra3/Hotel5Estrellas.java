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
public class Hotel5Estrellas extends Hoteles {

    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5Estrellas(int cantSalonesConferencia, int cantSuites, int cantLimosinas, int cantHabitaciones, int numCamas, int cantPisos, Gimnasio tipoGym, String nombreRest, int capacidadRest, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, tipoGym, nombreRest, capacidadRest, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public double getPrecio() {
        double valorLimosina = 15 * cantLimosinas;
       
        return super.getPrecio()+ valorLimosina;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

}
