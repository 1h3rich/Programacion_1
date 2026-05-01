/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5.config;

import Cuaderno_9.Ejercicio_5.Inventario;

/**
 *
 * @author 1DAM
 */
public class Validators {
    
    /**
     * Valida que el numero elegido comprende un numero valido
     * @param num_min Numero minimo
     * @param num_max Numero maximo
     * @param opcion  Opcion pasada por Scanner  
     * @return devuelve true o false
     */
    public static boolean comprenderEntre(double num_min, double num_max, int opcion){
        return opcion > num_min && opcion < num_max;
    }
    
    /**
     * Comprueba que en el inventario haya al menos 1 registro.
     * @param inventario 
     * @return devuelve true o false
     */
    public static boolean comprobarInventario(Inventario inventario){
        return inventario.getIndice() != 0;
    }
}
