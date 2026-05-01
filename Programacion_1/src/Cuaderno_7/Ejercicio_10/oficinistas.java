/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_7.Ejercicio_10;

/**
 *
 * @author Rich
 */
public class oficinistas {
    private String titulacion;
    private String horario;

    public oficinistas(String titulacion, String horario) {
        this.titulacion = titulacion;
        this.horario = "Diurno";
    }

    
    
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "\ntitulacion: " + titulacion + "\nhorario: " + horario;
    }
    
    
}
