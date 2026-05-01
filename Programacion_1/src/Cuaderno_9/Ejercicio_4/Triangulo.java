/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_4;

/**
 *
 * @author Rich
 */
public class Triangulo extends Figuras implements Operaciones{
        private double lado;

    public Triangulo(double lado, double grosor, String color) {
        super(grosor, color);
        this.lado = lado;
    }
    
    /**
     * Devuelve el area del triangulo equilatero
     * @return lado * lado*(Math.sqrt(3)/4);
     */
    @Override
    public double area() {
        return lado * lado*(Math.sqrt(3)/4);
    }
    
    /**
     * Devuelve el perimetro del triangulo
     * @return lado * 3
     */
    @Override
    public double perimetro() {
        return lado * 3;
    }

    @Override
    public String toString() {
        return super.id + " Triangulo de lado " +  lado + ", grosor " + grosor + ", y color " + color + "\n";
    }  
    
}
