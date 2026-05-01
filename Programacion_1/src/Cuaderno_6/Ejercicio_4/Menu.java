/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_6.Ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Rich
 */
public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("Bienvenido al generador de texto");
        System.out.println("Primero introduzca el tamaño del texto: ");
        int Tamaño = sc.nextInt();
        texto texto = new texto(Tamaño);
        System.out.println("El tamaño que ha elegido es: " + Tamaño);
        while (true) {
            System.out.println("\nSeleccione la opcion que desee: ");
            System.out.println("1. Rellenar contenido");
            System.out.println("2. Añadir caracter al principio");
            System.out.println("3. Añadir caracter al final");
            System.out.println("4. Añadir cadena al principio");
            System.out.println("5. Añadir cadena al final");
            System.out.println("6. Contar las vocales");
            System.out.println("7. Contar las mayusculas");
            System.out.println("8. Contar las minusculas");
            System.out.println("9. Informacion completa");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\nHa seleccionado rellenar contenido");
                    sc.nextLine();
                    String contenido = sc.nextLine();
                    texto.setContenido(contenido);
                }
                case 2 -> {
                    System.out.println("\nHa seleccionado añadir caracter al principio");
                    sc.nextLine();
                    char c = sc.nextLine().charAt(0);
                    texto.añadirInicio(c);
                }
                case 3 -> {
                    System.out.println("\nHa seleccionado añadir caracter al final");
                    sc.nextLine();
                    char c = sc.nextLine().charAt(0);
                    texto.añadirFinal(c);
                }
                case 4 -> {
                    System.out.println("\nHa seleccionado añadir cadena al inicio");
                    sc.nextLine();
                    String cadena = sc.nextLine();
                    texto.añadirInicio(cadena);
                }
                case 5 -> {
                    System.out.println("\nHa seleccionado añadir cadena al final");
                    sc.nextLine();
                    String cadena = sc.nextLine();
                    texto.añadirFinal(cadena);
                }
                case 6 -> {
                    System.out.println("\nHa seleccionado contar vocales");
                    System.out.println(texto.Vocales());
                }
                case 7 -> {
                    System.out.println("\nHa seleccionado contar mayusculas");
                    System.out.println(texto.Mayusculas());
                }
                case 8 -> {
                    System.out.println("\nHa seleccionado contar minusculas");
                    System.out.println(texto.Minusculas());                }
                case 9 -> {
                    System.out.println("\nHa seleccionado mostrar informacion completa");
                    texto.mostrar();
                }
                case 10 ->{
                    return;
                }
                default -> {
                    System.out.println("Hytale es el peak del gaming");
                }
            }
        }
    }
}
