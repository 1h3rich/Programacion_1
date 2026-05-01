/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioBiblioteca;

/**
 *
 * @author Rich
 */
public class MainBiblioteca {

    public static void main(String[] args) {
        Biblioteca alejandria = new Biblioteca("Alejandria");

        Libro socrates = new Libro("Se que no se nada", "Socrates");
        Libro CRP = new Libro("Critica de la razón pura", "Immanuel Kant");
        Libro CRPa = new Libro("Critica de la razón práctica", "Immanuel Kant");
        Libro AHZ = new Libro("Asi habló Zaratrustra", "Nietzcshe");

        alejandria.añadirLibro(socrates);
        alejandria.añadirLibro(AHZ);
        alejandria.añadirLibro(CRP);
        alejandria.añadirLibro(CRPa);

        System.out.println(socrates.toString());
        System.out.println(AHZ.toString());
        System.out.println(CRP.toString());
        System.out.println(CRPa.toString());
        
        alejandria.buscarPorAutor("socrates");
        alejandria.estadoLibro(AHZ, 0);
        alejandria.mostrarLibros();
        
        
    }
}
