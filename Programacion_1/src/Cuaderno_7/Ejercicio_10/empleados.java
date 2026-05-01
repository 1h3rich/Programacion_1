/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_7.Ejercicio_10;

/**
 *
 * @author Rich
 */
public class empleados {

    private final String nif;
    private final String nombre_completo;
    private final String f_nacimiento;
    private String d_completa;
    private int telefono;
    private String correo;
    private oficinistas oficinistas;
    private conductores conductores;
    private limpiadores limpiadores;

    public empleados(String nif, String nombre_completo, String f_nacimiento, String d_completa, int telefono, String correo) {
        this.nif = nif;
        this.nombre_completo = nombre_completo;
        this.f_nacimiento = f_nacimiento;
        this.d_completa = d_completa;
        this.telefono = telefono;
        this.correo = correo;
        this.oficinistas = null;
        this.conductores = null;
        this.limpiadores = null;

    }

    public String getD_completa() {
        return d_completa;
    }

    public void setD_completa(String d_completa) {
        this.d_completa = d_completa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public oficinistas getOficinistas() {
        return oficinistas;
    }

    public void setOficinistas(oficinistas oficinistas) {
        this.oficinistas = oficinistas;
    }

    public boolean isOficinistas() {
        return oficinistas != null;
    }

    public conductores getConductores() {
        return conductores;
    }

    public void setConductores(conductores conductores) {
        this.conductores = conductores;
    }

    public boolean isConductores() {
        return conductores != null;
    }

    public limpiadores getLimpiadores() {
        return limpiadores;
    }

    public void setLimpiadores(limpiadores limpiadores) {
        this.limpiadores = limpiadores;
    }

    public boolean isLimpiadores() {
        return limpiadores != null;
    }

    @Override
    public String toString() {
        String info =
               "--------------------------------------" +
               "\nnif: " + nif + 
               "\nnombre_completo: " + nombre_completo + 
               "\nf_nacimiento: " + f_nacimiento + 
               "\nd_completa: " + d_completa + 
               "\ntelefono: " + telefono + 
               "\ncorreo: " + correo;
               if(oficinistas != null){
                   info += oficinistas;
               }
               if(conductores != null){
                   info += conductores;
               }
               if(limpiadores != null){
                   info += limpiadores;
               }
               return info;
    }

}
