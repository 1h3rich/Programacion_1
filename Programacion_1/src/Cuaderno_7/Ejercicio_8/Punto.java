/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_7.Ejercicio_8;

/**
 *
 * @author Rich
 */
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        x += dx;
    }

    public void desplazaY(double dy) {
        y += dy;
    }

    public void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distanciaEuclidea(Punto otro) {
        double dx = otro.x - this.x;
        double dy = otro.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void mostrar() {
        System.out.println("Punto (" + x + ", " + y + ")");
    }
}
