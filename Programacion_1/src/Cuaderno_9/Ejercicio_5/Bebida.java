/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

/**
 *
 * @author 1DAM
 */
abstract class Bebida {
    private String nombre;
    protected int cod_id;
    private static int contador;
    public abstract double calcularPrecio();

    public Bebida(String nombre) {
        this.cod_id = contador;
        this.nombre = nombre;
        contador++;
    }
    
    public int getCod_id() {
        return cod_id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Bebida{" + '}';
    }
      
}