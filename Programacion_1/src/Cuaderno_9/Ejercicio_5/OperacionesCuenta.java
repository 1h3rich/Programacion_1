/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

/**
 *
 * @author 1DAM
 */
public interface OperacionesCuenta {
    public void ingresar(double cantidad);
    public void retirar(double cantidad);
    public double consultarSaldo();
    public boolean validarCredenciales(String titular, int pin);
}
