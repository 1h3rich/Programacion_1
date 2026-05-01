/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cuaderno_9.Ejercicio_3;

/**
 *
 * @author Rich
 */
public interface PrecioModificable {
    public abstract double calcularPrecioConIva();
    public abstract double calcularPrecioOferta(double descuento);
    public abstract double calcularPrecioPorCantidad(int cantidad);
}
