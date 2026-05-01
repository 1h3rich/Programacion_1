/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

/**
 *
 * @author 1DAM
 */
public class Banco {
    protected int codEntidad;
    protected int codOficina;

    public Banco(int codEntidad, int codOficina) {
        this.codEntidad = codEntidad;
        this.codOficina = codOficina;
    }
    //getters
    
    public int getCodEntidad() {
        return codEntidad;
    }

    public int getCodOficina() {
        return codOficina;
    }
    
    //setters

    public void setCodEntidad(int codEntidad) {
        this.codEntidad = codEntidad;
    }

    public void setCodOficina(int codOficina) {
        this.codOficina = codOficina;
    }

    @Override
    public String toString() {
        return "Banco{" + "codEntidad=" + codEntidad + ", codOficina=" + codOficina + '}';
    }

    
    
}
