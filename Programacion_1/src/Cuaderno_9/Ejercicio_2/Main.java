/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_9.Ejercicio_2;

/**
 *
 * @author Rich
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmailNotificacion Email1 = new EmailNotificacion("JoseLuis@gmail.com");
        SmsNotificacion SMS1 = new SmsNotificacion("666444333");
        
        Email1.enviar("Buenos dias jefe, pagueme lo que me debe o me voy.");
        SMS1.enviar("No quiero más spam de su maldita compañia, NO ME VOY A CAMBIAR DE COMPAÑIA.");
    }
    
}
