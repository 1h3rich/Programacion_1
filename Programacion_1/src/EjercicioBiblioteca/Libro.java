/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBiblioteca;

/**
 *
 * @author Rich
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean estado;
    private int id;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = true;
        this.id = (int) (Math.random() * 10000) + 10000;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEstado(int cambio) {
        if(cambio == 1){
            estado = true;
        }else{
            estado = false;
        }
        return estado;
    }

    public int getId() {
        return id;
    }    
    
    public boolean obtenerEstado(){
        if(estado == true){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", estado=" + estado + ", id=" + id + '}';
    }
    
    
}
