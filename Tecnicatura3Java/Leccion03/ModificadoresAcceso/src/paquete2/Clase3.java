package paquete2;

import paquete1.Clase1;
// Clase hija de la Clase1
// Accede a contenido protected dentro de la clase padre

public class Clase3 extends Clase1 {

    public Clase3() {
        // Al inicializar con un argumento, llama al constructor protected
        super("protected");
        System.out.println("this.atributoProtected antes = " + this.atributoProtected);
        this.atributoProtected = "Accediendo desde la clase hija";
        System.out.println("this.atributoProtected después = " + this.atributoProtected);
        this.metodoProtected();
    }
}
