/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_6.Ejercicio_1;

import java.util.Random;

/**
 *
 * @author Rich
 */
public class CuentaCorriente {

    private static String banco;
    private final String DNI;
    private final String NombreCliente;
    private double saldo = 0;
    private Gestor gestor;

    //Constructor
    public CuentaCorriente(String DNI, String NombreCliente) {
        this.DNI = DNI;
        this.NombreCliente = NombreCliente;
    }

    //Getters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getBanco() {
        return banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    //Metodos
    public void Ingresar(double dinero) {
        System.out.println("Ingreso exitoso");
        saldo = saldo + dinero;
    }

    public void Retirar(double dinero) {
        System.out.println("Retiro exitoso");
        saldo = saldo - dinero;
    }

    public void gestorAleatorio() {
        Gestor[] gestores = {
            new Gestor("Rodrigo Gonzalez", "12345678", "RodrigoGonzalez@gmail.com", 10000),
            new Gestor("Federico Garcia Lorca", "87654321", "FedericoGarciaLorca@gmail.com", 10000),
            new Gestor("Constantino Pla", "12348765", "ConstantinoPla@gmail.com", 10000)
        };

        int i = new Random().nextInt(gestores.length);
        this.gestor = gestores[i];
    }

    public void modificarImporte(double importe) {
        if (importe > 10000 || importe < 0) {
            System.out.println("Operacion no autorizada");
        } else {
            gestor.setImporte(importe);
            System.out.println("Importe modificado correctamente");
        }
    }

    public String datosGestor() {
        return gestor.mostrar();
    }

}
