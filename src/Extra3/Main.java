/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        alojamientos.add(new Hotel5Estrellas(2, 5, 10, 50, 120, 10, Gimnasio.A, "XO", 300, "Central", "Monterrey", "Mexico", "Reyes"));
        alojamientos.add(new Hotel4Estrellas(20, 2, 5, Gimnasio.A, "XL", 300, "Scape", "Lambayeque", "Chiclayo", "Perla"));
        alojamientos.add(new Camping(20, 10, true, true, 200, "Camping A", "Cuzco", "Cuzco", "Isabel"));
        alojamientos.add(new Camping(20, 10, false, false, 200, "Camping B", "Cuzco", "Cuzco", "Isabel"));
        alojamientos.add(new Residencias(25, false, true, true, 150, "Olivos", "Lima", "Miraflores", "Serrato"));
        alojamientos.add(new Residencias(25, true, true, true, 150, "Playa", "Lima", "Miraflores", "Serrato"));

        do {
            System.out.println("-----------------------MENÚ-----------------------");
            System.out.println("1. Mostrar todos los alojamientos disponibles");
            System.out.println("2. Hoteles del más barato al más caro");
            System.out.println("3. Mostrar todos los camping con restaurante");
            System.out.println("4. Mostrar todas las residencias que tienen descuento");
            System.out.println("5. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    //mostrar todos los alojamientos
                    System.out.println("ALOJAMIENTOS DISPONIBLES:");
                    System.out.println();
                    for (Alojamiento aux : alojamientos) {
                        System.out.println("Nombre: " + aux.getNombre());
                        System.out.println("Tipo: " + (aux instanceof Hoteles ? "Hotel" : "Alojamiento Extra hotelero"));
                        System.out.println("Dirección: " + aux.getDireccion());
                        System.out.println("Localidad: " + aux.getLocalidad());
                        System.out.println("Gerente: " + aux.getGerente());
                        if(aux instanceof Hoteles){
                            System.out.println("Precio: "+((Hoteles) aux).getPrecioHabitacion());
                        } 
                        System.out.println();
                    }
                    break;
                case 2:
                    //hoteles del más caro al más barato
                    System.out.println("HOTELES SEGÚN SU PRECIO");
                    System.out.println();
                    ArrayList<Hoteles> hoteles = new ArrayList<>();
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Hoteles) {
                            hoteles.add((Hoteles) aux);
                        }
                    }
                    Collections.sort(hoteles, Comparator.comparingDouble(Hoteles::getPrecioHabitacion).reversed());
                    for (Hoteles aux : hoteles) {
                        System.out.println("Nombre: " + aux.getNombre());
                        System.out.println("Precio de habitación: " + aux.getPrecioHabitacion());
                        System.out.println();
                    }
                    break;
                case 3:
                    //mostrar camping con restaurante
                    System.out.println("CAMPING CON DESCUENTO");
                    System.out.println();
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Camping) {
                            Camping camping = (Camping) aux;
                            if (camping.isPoseeRest()) {
                                System.out.println("Nombre: " + camping.getNombre());
                                System.out.println("Dirección: " + camping.getDireccion());
                                System.out.println("Localidad: " + camping.getLocalidad());
                                System.out.println("Gerente: " + camping.getGerente());
                                System.out.println("Tiene restaurante: Sí");
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 4:
                    //todas las residencias con descuente
                    System.out.println("RESIDENCIAS CON DESCUENTO");
                    System.out.println();
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Residencias) {
                            Residencias residencia = (Residencias) aux;
                            if (((Residencias) aux).isDescuentoGremio()) {
                                System.out.println("Nombre: " + residencia.getNombre());
                                System.out.println("Dirección: " + residencia.getDireccion());
                                System.out.println("Localidad: " + residencia.getLocalidad());
                                System.out.println("Gerente: " + residencia.getGerente());
                                System.out.println("Descuento para gremio: Sí");
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo");
            }
        } while (opcion != 5);

    }

}
