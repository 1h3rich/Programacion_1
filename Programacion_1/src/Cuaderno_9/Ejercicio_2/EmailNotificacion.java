/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_2;

/**
 *
 * @author Rich
 */
public class EmailNotificacion implements Notificacion{
    private final String direccionEmail;

    public EmailNotificacion(String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email a " + direccionEmail + ": " + mensaje);
        Notificacion.super.logearEnvio(mensaje);
    }
     
}
