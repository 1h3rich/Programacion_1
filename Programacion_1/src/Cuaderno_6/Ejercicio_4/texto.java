/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_6.Ejercicio_4;

import java.time.LocalDateTime;

/**
 *
 * @author Rich
 */
public class texto {

    private final int TAM;
    private String contenido;
    private final LocalDateTime CREACION;
    private LocalDateTime modificacion;

    //Constructo
    public texto(int TAM) {
        this.TAM = TAM;
        this.contenido = "";
        this.CREACION = LocalDateTime.now();
        this.modificacion = this.CREACION;
    }

    //Getters y setters
    public boolean setContenido(String contenido) {
        
        if (contenido.length() > TAM) {
            System.out.println("Longitud del contenido demasiado larga");
            return false;
        }
        System.out.println("Contenido rellenado exitosamente.");
        System.out.println("");
        this.contenido = contenido;
        return true;
    }

    //Metodos
    public int espacio() {
        return TAM - contenido.length();
    }

    public boolean añadirInicio(char c) {
        if (espacio() < 1) {
            System.out.println("No hay espacio");
            return false;
        }
        contenido = c + contenido;
        modificacion = LocalDateTime.now();
        return true;
    }

    public boolean añadirFinal(char c) {
        if (espacio() < 1) {
            System.out.println("No hay espacio");
            return false;
        }
        contenido = contenido + c;
        modificacion = LocalDateTime.now();
        return true;
    }

    public boolean añadirInicio(String cadena) {
        if (cadena == null) {
            cadena = "";
        }
        if (espacio() < cadena.length()) {
            System.out.println("No hay espacio");
            return false;
        }
        contenido = cadena + contenido;
        modificacion = LocalDateTime.now();
        return true;
    }

    public boolean añadirFinal(String cadena) {
        if (cadena == null) {
            cadena = "";
        }
        if (espacio() < cadena.length()) {
            System.out.println("No hay espacio");
            return false;
        }
        contenido = contenido + cadena;
        modificacion = LocalDateTime.now();
        return true;
    }

    public int Vocales() {
        int contador = 0;
        for (int i = 0; i < contenido.length(); i++) {
            char c = Character.toLowerCase(contenido.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public int Mayusculas() {
        int contador = 0;
        for (int i = 0; i < contenido.length(); i++) {
            if (Character.isUpperCase(contenido.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public int Minusculas() {
        int contador = 0;
        for (int i = 0; i < contenido.length(); i++) {
            if (Character.isLowerCase(contenido.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public void mostrar() {
        System.out.println("-------Texto--------");
        System.out.println("Contenido: " + contenido);
        System.out.println("Longitud actual: " + contenido.length());
        System.out.println("Longitud maxima: " + TAM);
        System.out.println("Espacios disponibles: " + espacio());
        System.out.println("Vocales: " + Vocales());
        System.out.println("Mayusculas: " + Mayusculas());
        System.out.println("Minusculas: " + Minusculas());
        System.out.println("Fecha de creacion: " + CREACION);
        System.out.println("Ultima modificacion: " + modificacion);
        System.out.println("--------------------");
    }

}
