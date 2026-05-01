/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_9.Ejercicio_1;

/**
 *
 * @author Rich
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        discoDuro C = new discoDuro("Lambo");
        MemoriaUSB USB = new MemoriaUSB("SamDisk");

        C.guardarDatos("Buenos dias");
        C.leerDatos();
        C.guardarDatos("Buenas tardes");
        C.informacion();
        C.borrarDatos("Buenos dias");
        C.informacion();
        System.out.println("----------------");
        USB.guardarDatos("Buenos dias");
        USB.leerDatos();
        USB.guardarDatos("Buenas tardes");
        USB.informacion();
        USB.borrarDatos("Buenos dias");
        USB.informacion();

    }

}
