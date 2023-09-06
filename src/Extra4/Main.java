/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra4;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Filosofía", "Alfonso", "Alfonso", 5050, "Soltero");
        Profesores profesor1 = new Profesores("Ciencias", 2023, 15, "Alfonso", "Alfonso", 1010, "Casado");
        PersonalDeServicio personal1 = new PersonalDeServicio("A", 2020, 15, "Alfonso", "Alfonso", 6060, "Casado");

        System.out.println("Información del estudiante");
        System.out.println(estudiante1.getInformacion());
        System.out.println();
        System.out.println("Información del profesor");
        System.out.println(profesor1.getInformacion());
        System.out.println();
        System.out.println("Información del personal de servicio");
        System.out.println(personal1.getInformacion());
    }
}
