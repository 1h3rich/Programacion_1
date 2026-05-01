/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cuaderno_9.Ejercicio_1;

/**
 *
 * @author 1DAM
 */
public interface Almacenable {
    public abstract boolean guardarDatos(String datos);
    public abstract String leerDatos();
    public abstract boolean estaLleno();
    public abstract void informacion();
    public abstract boolean borrarDatos(String datos);
}
