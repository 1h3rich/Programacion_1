/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_3;

/**
 *
 * @author Rich
 */
public class Libro implements PrecioModificable {

    private final String titulo;
    private final String año;
    private final String escritor;
    private final double precioBase;

    public Libro(String titulo, String año, String escritor, double precioBase) {
        this.titulo = titulo;
        this.año = año;
        this.escritor = escritor;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioConIva() {
        return this.precioBase * 1.04;
    }

    @Override
    public double calcularPrecioOferta(double descuento) {
        return this.precioBase * (1 - descuento/100);
    }

    @Override
    public double calcularPrecioPorCantidad(int cantidad) {
        if (cantidad >= 10 && cantidad <= 99) {
            return calcularPrecioOferta(4);
        } else if (cantidad >= 100 && cantidad <= 999) {
            return calcularPrecioOferta(8);
        } else if (cantidad >= 1000){
            return calcularPrecioOferta(16);
        }else{
            return this.precioBase;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", a\u00f1o=" + año + ", escritor=" + escritor + ", precioBase=" + precioBase + '}';
    }

}
