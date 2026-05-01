/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;
/**
 *
 * @author 1DAM
 */
public abstract class Alcohol extends Bebida{
    protected double graduacionAlcohol;
    public abstract double calcularPrecio();

    public Alcohol(double graduacionAlcohol, String nombre) {
        super(nombre);
        this.graduacionAlcohol = graduacionAlcohol;
    }

}
