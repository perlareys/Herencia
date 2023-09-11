/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Lavadora l1= new Lavadora(20,100,"Blanco", Consumo.B, 50);
//        System.out.println("El precio final de la lavadora es: "+ l1.precioFinal(l1));
//        Televisor t1= new Televisor(44,false, 100,"Negro",Consumo.A,5);
//        System.out.println("El precio final de la lavadora es: "+ t1.precioFinal(t1));

        List<Electrodomestico> listaElectros = new ArrayList<>();

        Televisor tv1 = new Televisor(100, true, 233, "Blanco", Consumo.C, 40);
        System.out.println(tv1.toString());
        System.out.println();
        Televisor tv2 = new Televisor(100, false, 233, "Blanco", Consumo.C, 40);
        System.out.println(tv2.toString());
        System.out.println();
        Lavadora l1 = new Lavadora(20, 100, "Negro", Consumo.A, 50);
        
        Lavadora l2 = new Lavadora(40, 150, "Negro", Consumo.A, 50);

        listaElectros.add(tv1);
        listaElectros.add(tv2);
        listaElectros.add(l1);
        listaElectros.add(l2);

        double precioTotalTotal = 0;
        double precioTtlLavadoras = 0;
        double precioTtlTvs = 0;

        for (Electrodomestico aux : listaElectros) {
            double precioFinal = aux.precioFinal(aux);
            precioTotalTotal += precioFinal;

            if (aux instanceof Lavadora) {
                precioTtlLavadoras += precioFinal;
            } else if (aux instanceof Televisor) {
                precioTtlTvs += precioFinal;
            }
            System.out.println("El precio final es: " + precioFinal);
        }
        System.out.println("Precio total de los electrodomésticos: " + precioTotalTotal);
        System.out.println("Precio total de lavadoras: " + precioTtlLavadoras);
        System.out.println("Precio total de televisores " + precioTtlTvs);
    }

}
