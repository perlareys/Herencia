/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Lavadora l1= new Lavadora();
//        l1.crearLavadora();
//        String info= l1.caracteristicas();
//        System.out.println(info);
        System.out.println("---------------------------------");
        Televisor tv1= new Televisor();
        tv1.crearTelevisor();
        String infoTV= tv1.caracteristicas();
        System.out.println(infoTV);
    }

}
