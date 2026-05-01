/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_7.Ejercicio_7;

/**
 *
 * @author Rich
 */
public class Inicio {
    
    static Calendario Fecha1 = new Calendario(13, 3, 2002);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha1.mostrar();
        Fecha1.incrementarAño(1);
        Fecha1.incrementarMes();
        Fecha1.incrementarDia();
        Fecha1.mostrar();
        
    }
    
}
