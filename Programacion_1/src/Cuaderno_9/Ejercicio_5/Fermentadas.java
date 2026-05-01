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
public class Fermentadas extends Alcohol{

    public Fermentadas(double graduacionAlcohol, utils.tiposFermentada nombre) {
        super(graduacionAlcohol, nombre.name());
        super.graduacionAlcohol = (Math.random() * 11) + 5;
    }
        
    @Override
    public double calcularPrecio() {
        double precio = 5 + (graduacionAlcohol/10);
        return precio;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        cadena = getNombre() + " tiene de graduación " + String.format("%.2f", graduacionAlcohol) + " y su valor es de: " + String.format("%.2f", calcularPrecio());
        return cadena;
    }
    
}
