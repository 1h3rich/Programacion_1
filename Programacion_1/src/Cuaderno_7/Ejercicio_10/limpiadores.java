/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_7.Ejercicio_10;

/**
 *
 * @author Rich
 */
public class limpiadores {
    private boolean l_oficinas;
    private boolean l_buses;
    private boolean l_garajes;

    public limpiadores(boolean l_oficinas, boolean l_buses) {
        this.l_oficinas = l_oficinas;
        this.l_buses = l_buses;
        this.l_garajes = false;
    }
    
    

    public boolean isL_oficinas() {
        return l_oficinas;
    }

    public void setL_oficinas(boolean l_oficinas) {
        this.l_oficinas = l_oficinas;
    }

    public boolean isL_buses() {
        return l_buses;
    }

    public void setL_buses(boolean l_buses) {
        this.l_buses = l_buses;
    }

    public boolean isL_garajes() {
        return l_garajes;
    }

    public void setL_garajes(boolean l_garajes) {
        this.l_garajes = l_garajes;
    }

    @Override
    public String toString() {
        return "\nOficinas: " + l_oficinas + "\nBuses: " + l_buses;
    }
    
    
    
}
