/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Pia Olivera
 */
public class Gerente extends empleado{
    private String departamento;
    
    public Gerente (String Nombre, double Sueldo, String departamento){
        super(Nombre, Sueldo);
        this.departamento = departamento;
    }
    
    // SOBRE ESCRIBIMOS EL METODO 
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+ ", Departamento: "+ this.departamento;
        
    }
}
