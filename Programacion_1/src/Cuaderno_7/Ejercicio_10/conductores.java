/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_7.Ejercicio_10;

/**
 *
 * @author Rich
 */
public class conductores {

    private int carnets;
    private int año;

    public conductores(int carnets, int año) {
        this.carnets = carnets;
        this.año = año;
    }

    public int getCarnets() {
        return carnets;
    }

    public boolean setCarnets(int carnets) {
        if (carnets > 15) {
            return false;
        } 
        this.carnets = carnets;
        return true;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return "\ncarnets: " + carnets + "\na\u00f1o: " + año;
    }
    
    
}
