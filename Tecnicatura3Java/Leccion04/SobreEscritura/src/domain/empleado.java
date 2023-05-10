/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Pia Olivera
 */
public class empleado {
    protected String nombre;
    protected double sueldo;
    
    public empleado(String nombre,double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    // METODO PARA LA SOBREESCRITURA
    public String obtenerDetalles(){
    return "Nombre: "+ this.nombre+ ", Sueldo: "+this.sueldo;
            }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
