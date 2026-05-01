/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cuaderno_9.Ejercicio_2;
import java.time.LocalTime;

/**
 *
 * @author Rich
 */
public interface Notificacion {
    public abstract void enviar(String mensaje);
    
    public default void logearEnvio(String mensaje){
            System.out.println("Mensaje: " + mensaje + " Enviado exitosamente a las " + LocalTime.now());
    }
}
