/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Perla
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        ArrayList<Animal> listaAnimales = new ArrayList();
        listaAnimales.add(a);
        listaAnimales.add(b);
        listaAnimales.add(c);

        for (Animal aux : listaAnimales) {
            System.out.println(aux.hacerRuido());
        }
    }

}
