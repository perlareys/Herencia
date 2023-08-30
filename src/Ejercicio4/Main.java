/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(2, 4);
        System.out.println("El área del círculo es: " + c1.calculateArea());
        System.out.println("El perímetro del círculo es: " + c1.calculatePerimeter());
        Rectangle r1 = new Rectangle(4, 2);
        System.out.println("El área del rectángulo es: " + r1.calculateArea());
        System.out.println("El perímetro del rectángulo es: " + r1.calculatePerimeter());
    }

}
