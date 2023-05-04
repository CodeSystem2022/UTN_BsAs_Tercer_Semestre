package paquete1;

// Modificador de acceso public, aplica a:
//  CLASE - VARIABLE - METODO - CONSTRUCTOR
// Esta clase puede ser utilizada desde otra clase, del mismo paquete u otro
public class Clase1 {

    public String atributoPublic = "Mi atributo public";
    protected String atributoProtected = "Mi atributo protected";

    public Clase1() {
        System.out.println("Mi constructor public");
    }

    protected Clase1(String atributo) {
        System.out.println("Mi constructor protected");
    }

    public void metodoPublic() {
        System.out.println("Mi método public");
    }

    protected void metodoProtected() {
        System.out.println("Mi método protected");
    }

}
