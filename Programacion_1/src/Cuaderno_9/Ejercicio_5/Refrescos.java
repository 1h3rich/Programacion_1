/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;
import Cuaderno_9.Ejercicio_5.config.utils;
/**
 *
 * @author 1DAM
 */
public class Refrescos extends Bebida{

    private boolean tieneGas;
    private double cantidadAzucar;

    public Refrescos(boolean tieneGas, double cantidadAzucar, utils.tiposResfresco nombre) {
        super(nombre.name());
        this.tieneGas = tieneGas;
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean isTieneGas() {
        return tieneGas;
    }

    @Override
    public double calcularPrecio() {
        double precio = 1 + (cantidadAzucar / 10);
        return precio;
        
    }
    
    @Override
    public String toString() {
        String cadena = "";
        cadena = getNombre() + " tiene de azucar " + String.format("%.2f", cantidadAzucar) + " y su valor gaseoso es " + String.format("%.2f", calcularPrecio());
        return cadena;
    }
    
    
}
