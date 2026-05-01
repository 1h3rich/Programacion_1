/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

/**
 *
 * @author 1DAM
 */
public class Inventario {

    Bebida[] bebidas;
    private int indice;
   
    public Inventario(int capacidad) {
        bebidas = new Bebida[capacidad];
        indice = 0;
    }
    /**
     * Método para insertar bebidas
     * @param b Le pasamos una bebida
     * @return Devuelve un boolean
     */
    public boolean insertar(Bebida b) {
        if (indice < bebidas.length) {
            bebidas[indice] = b;
            indice++;
            return true;
        }
        return false;
    }

    public int getIndice() {
        return indice;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < indice; i++) {
            resultado += "(" + i + ") " + bebidas[i] + "\n";
        }
        return resultado;
    }
}

