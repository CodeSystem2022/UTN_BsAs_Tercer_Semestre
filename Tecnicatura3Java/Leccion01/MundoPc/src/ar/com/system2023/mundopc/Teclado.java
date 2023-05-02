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
public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados; 

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
        
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + "}";
    }
    
    
    
}
