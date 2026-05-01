/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cuaderno_9.Ejercicio_4;

/**
 *
 * @author Rich
 */
public abstract class Figuras implements Operaciones{
    protected int id;
    private static int contador = 0;
    protected double grosor;
    protected String color;

    public Figuras(double grosor, String color) {
        this.id = contador;
        this.grosor = grosor;
        this.color = color;
        contador++;
    }    

    public double getGrosor() {
        return grosor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
