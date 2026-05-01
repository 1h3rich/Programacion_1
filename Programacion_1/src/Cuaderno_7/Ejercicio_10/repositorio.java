/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_7.Ejercicio_10;
/**
 *
 * @author Rich
 */
public class repositorio {

    private final empleados[] repositorio_empleados;
    private int indice;

    public repositorio(int capacidad) {
        repositorio_empleados = new empleados[capacidad];
        indice = 0;
    }

    public empleados consultar(int pos) {
        if (pos >= 0 && pos < indice) {
            return repositorio_empleados[pos];
        }
        return null;
    }

    public boolean insertar(empleados e) {
        if (indice < repositorio_empleados.length) {
            repositorio_empleados[indice] = e;
            indice++;
            return true;
        }
        return false;
    }

    public boolean eliminar(int pos) {
        if (pos >= 0 && pos < indice) {
            for (int i = pos; i < indice; i++) {
                repositorio_empleados[i] = repositorio_empleados[i + 1];
            }
            repositorio_empleados[indice - 1] = null;
            indice--;
            return true;
        }
        return false;
    }

    public void mostrar() {
        if (indice == 0) {
            System.out.println("No hay empleados");
            return;
        }

        for (int i = 0; i < repositorio_empleados.length; i++) {
            if (repositorio_empleados[i] == null) {
                System.out.println("");
                System.out.println(i + "No hay empleado registrado.");
            } else {
                System.out.println(i + " -> " + repositorio_empleados[i]);
            }
        }
    }
}
