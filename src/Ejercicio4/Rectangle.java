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
public class Rectangle implements CalculationForms {

    private double base;
    private double altura;

    public Rectangle() {
    }

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        double area;
        area = base * altura;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = (base + altura) * 2;
        return perimeter;
    }
}
