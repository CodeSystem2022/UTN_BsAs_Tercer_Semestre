package paquete1;

public class ClaseHija2 extends Clase2 {

    public ClaseHija2() {
        super();
        this.atributoDefault = "Atributo default modificado desde clase hija";
        System.out.println(this.atributoDefault);
        this.metodoDefault();
    }
}
