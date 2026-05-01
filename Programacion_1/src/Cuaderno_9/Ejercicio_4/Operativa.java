/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cuaderno_9.Ejercicio_4;

/**
 *
 * @author Rich
 */
public interface Operativa {
    public boolean insertar(Figuras objeto);
    public boolean actualizar(int posicion, Figuras objeto);
    public boolean eliminar(int posicion);
    public Figuras consultar(int posicion);
}
