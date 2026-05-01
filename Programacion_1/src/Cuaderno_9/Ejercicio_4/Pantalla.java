/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_4;

import java.util.ArrayList;

/**
 *
 * @author Rich
 */
public class Pantalla implements Operativa{

    ArrayList<Figuras> lista = new ArrayList();

    @Override
    public boolean actualizar(int posicion, Figuras objeto) {
        if(posicion >= 0 && posicion <= lista.size()){
            lista.remove(posicion);
            lista.add(objeto);
            System.out.println(lista.get(posicion));
            System.out.println("Posicion correctamente actualizada");
            return true;
        }
        System.out.println("Lamentablemente no se ha podido actualizar la posicion");
        return false;
    }
    
    /**
     * Devuelve el objeto Figuras si existe en la posicion pasada
     * @param posicion
     * @return Figuras or null
     */
    @Override
    public Figuras consultar(int posicion) {
        if (posicion >= 0 && posicion <= lista.size()) {
            System.out.println(lista.get(posicion));
            return lista.get(posicion);
        }
        System.out.println("No se ha encontrado o no existe la posicion indicada a consultar");
        return null;
    }

    /**
     * Elimina el objeto en cuestion si existe y la lista no esta vacia.
     *
     * @param posicion
     * @return true or false
     */
    @Override
    public boolean eliminar(int posicion) {
        if (!lista.isEmpty()) {
            lista.remove(posicion);
            System.out.println("Posicion eliminada exitosamente");
            return true;
        }
        System.out.println("Lamentablemente no se ha podido eliminar la posicion indicada");
        return false;
    }

    /**
     * Añade un objeto de tipo Figuras al ArrayList
     *
     * @param objeto Figuras
     * @return true
     */
    @Override
    public boolean insertar(Figuras objeto) {
        lista.add(objeto);
        return true;
    }

    /**
     * Reescribe el metodo toString
     *
     * @return
     */
    @Override
    public String toString() {
        String cadena = "";
        for (Figuras figuras : lista) {
            cadena = cadena + figuras.toString();
        }
        return cadena;
    }
    
    

}
