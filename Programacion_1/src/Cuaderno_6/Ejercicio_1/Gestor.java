/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_6.Ejercicio_1;

/**
 *
 * @author Rich
 */
public class Gestor {

    private final String nombreGestor;
    private final String numero;
    private final String email;
    private double importe;

    public Gestor(String nombreGestor, String numero, String email, int importe) {
        this.nombreGestor = nombreGestor;
        this.numero = numero;
        this.email = email;
        this.importe = importe;
    }

    public String getNombreGestor() {
        return nombreGestor;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        if (importe > 10000 || importe < 0) {
            System.out.println("Importe no valido");
        } else {
            this.importe = importe;
        }
    }

    //Metodos
   public String mostrar(){
       return ""
               + "nombre : " + nombreGestor + ""
               + ", telefono : " + numero + ""
               + ", importe : " + importe + "}";
   }
}
