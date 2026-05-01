/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBiblioteca;

import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author Rich
 */
public class Biblioteca {
    private final String nombre;
    private ArrayList<Libro> lista = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadirLibro(Libro l){
        lista.add(l);
    }
    
    public String mostrarLibros(){
        String cadena = "";
        for (Libro libro : lista) {
            cadena = cadena + libro.toString();
        }
        return cadena;
    }
    
    public void estadoLibro(Libro l, int devolucion){
        if(devolucion == 0){
            l.isEstado(devolucion);
            System.out.println(l.getAutor());
            System.out.println(l.obtenerEstado());
        }else{
            l.isEstado(devolucion);
            System.out.println(l.getAutor());
            System.out.println(l.obtenerEstado());
        }
    }
    
    public Libro buscarPorAutor(String autor){
        for (Libro libro : lista) {
            if(libro.getAutor().equalsIgnoreCase(autor)){
                System.out.println(libro.toString());
                return libro;
            }else{
                System.out.println("Libro no encontrado");
                return null;
            }
        }
        return null;
    }
}
