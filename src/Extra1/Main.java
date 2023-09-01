/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barco velero = new Velero("P1997", 15, 2023, 3);
        LocalDate fechaAlquilerV = LocalDate.of(2023, 9, 1);
        LocalDate fechaDevolucionV = LocalDate.of(2023, 9, 4);
        Alquiler clienteVelero = new Alquiler("Perla", "7051", fechaAlquilerV, fechaDevolucionV, 1, velero);
        clienteVelero.calcularAlquiler();
        System.out.println(clienteVelero.toString());
        System.out.println("El monto a pagar por alquilar un velero por " + (fechaDevolucionV.toEpochDay() - fechaAlquilerV.toEpochDay()) + " días es: " + clienteVelero.calcularAlquiler());

        Barco bMotor = new BarcoMotor(30, "P1997", 4, 2023);
        LocalDate fechaAlquilerBM = LocalDate.of(2023, 9, 1);
        LocalDate fechaDevolucionBM = LocalDate.of(2023, 9, 4);
        Alquiler clienteBMotor = new Alquiler("Perla", "7051", fechaAlquilerBM, fechaDevolucionBM, 1, bMotor);
        clienteBMotor.calcularAlquiler();
        System.out.println(clienteBMotor.toString());
        System.out.println("El monto a pagar por alquilar un barco motor por " + (fechaDevolucionBM.toEpochDay() - fechaAlquilerBM.toEpochDay()) + " días es: " + clienteBMotor.calcularAlquiler());
    }

}
