/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import domain.*;
import domain.Gerente;

/**
 *
 * @author Pia Olivera
 */
public class textSobreEscritura {
    public static void main (String[] args){
        empleado empleado1 = new empleado("Jose", 10000);
        imprimir(empleado1);
        empleado1 = new Gerente("Juan", 5000, "Sistemas");
        imprimir(empleado1);
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
}
    public static void imprimir (empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
    
}