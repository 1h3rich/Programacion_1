/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDepartamento;

import java.util.ArrayList;

/**
 *
 * @author Rich
 */
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> lista = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarEmpleado(Empleado e){
        lista.add(e);
    }
    
    public Empleado buscarEmpleado(int id){
        for (Empleado empleado : lista) {
            if(empleado.equals(id)){
                return empleado;
            }
        }
        return null;
    }
    
    public void aumentarSalarioGeneral(int porcentaje){
        for (Empleado empleado : lista) {
            empleado.aumentar_Salario(porcentaje);
        }
    }
    
    public void mostrarEmpleados(){
        for (Empleado empleado : lista) {
            System.out.println("\n" + empleado.toString());
        }
    }
}
