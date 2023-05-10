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
public class textInstanceOff {
    public static void main (String[] args){
        empleado empleado1 = new empleado("Jose", 10000);
        // determinarTipo(empleado1);
        empleado1 = new Gerente("Juan", 5000, "Sistemas");
        determinarTipo(empleado1);
    }
    
    public static void determinarTipo (empleado empleado){
       if (empleado instanceof Gerente){
           System.out.println("Es de tipo Gerente");
           Gerente gerente = (Gerente)empleado;
           ((Gerente) empleado).getDepartamento();
           System.out.println("gerente = " + gerente.getDepartamento());
        }
     else  if (empleado instanceof empleado){
           System.out.println("Es de tipo empleado");
           
       }
     else if(empleado instanceof Object){
           System.out.println("Es de tipo Object");
       }
    }
    
}