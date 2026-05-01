/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_2;

/**
 *
 * @author Rich
 */
public class SmsNotificacion implements Notificacion{
    private String numeroTelefono;

    public SmsNotificacion(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS al numero " + numeroTelefono + ": " + mensaje) ;
        Notificacion.super.logearEnvio(mensaje);
    }
}
