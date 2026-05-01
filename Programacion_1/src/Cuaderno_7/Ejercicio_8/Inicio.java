/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_7.Ejercicio_8;

/**
 *
 * @author Rich
 */
public class Inicio {
    public static void main(String[] args) {

        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(5, 7);

        p1.mostrar(); // Punto (2.0, 3.0)

        p1.desplazaX(1);
        p1.desplazaY(-2);
        p1.mostrar();// Punto (3.0, 1.0)

        p1.desplaza(2, 2);
        p1.mostrar(); // Punto (5.0, 3.0)

        System.out.println(p1.distanciaEuclidea(p2)); // distancia
    }
}

