/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDepartamento;

/**
 *
 * @author Rich
 */
public class Empleado {
    private String nombre;
    private int identificador;
    private double salario;
    private Departamento departamento;
    private static int contador;

    public Empleado(String nombre, double salario, Departamento departamento) {
        this.nombre = nombre;
        identificador = contador;
        this.salario = salario;
        this.departamento = departamento;
        contador++;
    }
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public static int getContador() {
        return contador;
    }
    
    //Metodos
    
    public void aumentar_Salario(double porcentaje){
        if(porcentaje < 0 || porcentaje > 100){
            System.out.println("El porcentaje es comprendido entre 0 y 100");
        }else{
            this.salario = this.salario + (this.salario * (porcentaje/100));
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", identificador=" + identificador + ", salario=" + salario + ", departamento=" + departamento.getNombre() + '}';
    }
    
    
}
