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
public class Circle implements CalculationForms {

    private double radio;
    private double diameter;

    public Circle() {
    }

    public Circle(double radio, double diameter) {
        this.radio = radio;
        this.diameter = diameter;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double calculateArea() {
        double area;
        area = CalculationForms.PI * radio * radio;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = CalculationForms.PI * diameter;
        return perimeter;
    }
}
