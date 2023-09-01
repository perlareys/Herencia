/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra2;

import java.util.ArrayList;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> listaEdificios = new ArrayList<>();
        Edificio polideportivo1 = new Polideportivo("A", Instalacion.Abierto, 10, 20, 5);
        Edificio polideportivo2 = new Polideportivo("B", Instalacion.Techado, 10, 20, 5);
        Edificio oficinas1 = new EdificioDeOficinas("C", 5, 3, 5, 10, 20, 20);
        Edificio oficinas2 = new EdificioDeOficinas("D", 5, 5, 5, 10, 20, 20);
        listaEdificios.add(polideportivo1);
        listaEdificios.add(polideportivo2);
        listaEdificios.add(oficinas1);
        listaEdificios.add(oficinas2);

        int techado = 0;
        int abierto = 0;

        for (Edificio aux : listaEdificios) {
            System.out.println(aux.toString());
            System.out.println("Superficie: " + aux.calcularSuperficie());
            System.out.println("Volumen: " + aux.calcularVolumen());

            if (aux instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) aux;
                Instalacion tipoTecho = polideportivo.getInstalacion();
                if (tipoTecho == Instalacion.Techado) {
                    techado += 1;
                } else if (tipoTecho == Instalacion.Abierto) {
                    abierto += 1;
                }
            }

            if (aux instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) aux).cantPersonas();
            }

            System.out.println("------------------------------------------------------");
        }
        System.out.println("Total de polideportivos techados: " + techado);
        System.out.println("Total de polideportivos abiertos: " + abierto);
    }

}
