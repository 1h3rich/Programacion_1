/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_4;

/**
 *
 * @author Rich
 */
public class Rectangulo extends Figuras implements Operaciones{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, double grosor, String color) {
        super(grosor, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Devuelve el area del rectangulo
     * @return base * altura
     */
    @Override
    public double area() {
        return base*altura;
    }

    /**
     * Devuelve el perimetro del rectangulo
     * @return (2*base) + (2*altura)
     */
    @Override
    public double perimetro() {
        return (2*base) + (2*altura);
    }

    @Override
    public String toString() {
        return super.id + " Rectangulo de base " + base + ", con altura " + altura + ", grosor " + grosor + ", y color " + color + "\n";
    }
    
    
}
