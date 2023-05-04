package test;

import paquete1.Clase1;
import paquete2.Clase3;
import paquete2.Clase4;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1);
        System.out.println("clase1.atributoPublic = " + clase1.atributoPublic);
        clase1.metodoPublic();
        System.out.println("");

        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
        System.out.println("");

        Clase4 clasePrivate = new Clase4("Hola");
        System.out.println("clasePrivate = " + clasePrivate);
        System.out.println(clasePrivate.getAtributoPrivate());
        clasePrivate.setAtributoPrivate("Modificando atributo private desde setter");
        System.out.println(clasePrivate.getAtributoPrivate());
    }
}
