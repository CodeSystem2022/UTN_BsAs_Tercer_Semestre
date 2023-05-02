/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.system2023.mundopc;


/**
 *
 * @author Maxi
 */
public class Orden {
    private final int idOrden;
    private Computadora computadora[];    
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.computadora = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (contadorComputadora < MAX_COMPUTADORAS) {
            this.computadora[this.contadorComputadora++] = computadora;            
        } else {
            System.out.println("Has superado el límite: " + MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadora; i++) {
            System.out.println(computadora[i]);
        }
    }
    
    
}
