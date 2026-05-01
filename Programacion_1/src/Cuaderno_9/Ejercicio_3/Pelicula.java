/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_3;

/**
 *
 * @author Rich
 */
public class Pelicula implements PrecioModificable {

    private String titulo;
    private String añoEstreno;
    private String director;
    private double precioBase;

    public Pelicula(String titulo, String añoEstreno, String director, double precioBase) {
        this.titulo = titulo;
        this.añoEstreno = añoEstreno;
        this.director = director;
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
        if (cantidad >= 5 && cantidad <= 49) {
            return calcularPrecioOferta(3 / 100);
        } else if (cantidad >= 50 && cantidad <= 499) {
            return calcularPrecioOferta(6 / 100);
        } else if(cantidad >= 500){
            return calcularPrecioOferta(12 / 100);
        }else{
            return this.precioBase;
        }
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", a\u00f1oEstreno=" + añoEstreno + ", director=" + director + ", precioBase=" + precioBase + '}';
    }
}
