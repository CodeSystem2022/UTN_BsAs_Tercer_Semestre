package paquete1;

// Clase tipo default o package (la ausencia del modificador)
// Puede ser utilizada solo dentro del mismo paquete
// Puede extender desde otra clase 
// Puede ser clase padre
// No se puede utilizar el main TestModificadoresAcceso, por estar dentro del 
//                                                              package main
class Clase2 {

    String atributoDefault = "Mi atributo default";

    Clase2() {
        System.out.println("Mi constructor default");
    }

    void metodoDefault() {
        System.out.println("Mi método default");
    }
}
