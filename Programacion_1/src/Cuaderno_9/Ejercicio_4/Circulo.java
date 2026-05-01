/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_4;

/**
 *
 * @author Rich
 */
public class Circulo extends Figuras implements Operaciones{
    private final double radio;

    public Circulo(double radio, double grosor, String color) {
        super(grosor, color);
        this.radio = radio;
    }

    /**
     * Devuelve el area del circulo
     * @return Math.PI * radio * radio
     */
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    /**
     * Devuelve el perimetro del circulo
     * @return 2 * Math.PI * radio
     */
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return super.id + " Circulo de radio" + radio + ", con grosor " + grosor + ", y color " + color + "\n";
    }
    
    
}
