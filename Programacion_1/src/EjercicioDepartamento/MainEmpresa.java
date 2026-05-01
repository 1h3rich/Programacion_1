/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioDepartamento;

/**
 *
 * @author Rich
 */
public class MainEmpresa {

    public static void main(String[] args) {
        Departamento AWS = new Departamento("AWS");
        Departamento DAM = new Departamento("DAM");
        Empleado ricardo = new Empleado("Ricardo", 2000, AWS);
        Empleado juan = new Empleado("Juan", 2000, AWS);
        Empleado rodrigo = new Empleado("Rodrigo", 1750, DAM);
        Empleado jorge = new Empleado("Jorge", 1750, DAM);
        
        AWS.agregarEmpleado(ricardo);
        AWS.agregarEmpleado(juan);
        DAM.agregarEmpleado(jorge);
        DAM.agregarEmpleado(rodrigo);
        
        
        System.out.println(ricardo.toString());
        System.out.println(jorge.toString());
        ricardo.aumentar_Salario(20);
        System.out.println(juan.toString());
        System.out.println(rodrigo.toString());
        System.out.println(ricardo.toString());
        
        AWS.aumentarSalarioGeneral(20);
        DAM.aumentarSalarioGeneral(50);
        
        AWS.buscarEmpleado(1);
        AWS.mostrarEmpleados();
        DAM.buscarEmpleado(0);
        DAM.mostrarEmpleados();
    }

}
