package paquete2;

public class Clase4 {

    private String atributoPrivate = "Mi atributo private";

    //Constructor privado
    private Clase4() {
        System.out.println("Mi constructor private");
    }

    // Constructor publico, para poder instanciar objetos
    public Clase4(String algo) {
        this(); // Llama al constructor Clase4()
        System.out.println("Mi constructor publico");
        System.out.println("Ejecutando metodoPrivate() desde el constructor");
        this.metodoPrivate();
    }

    private void metodoPrivate() {
        System.out.println("Mi método private");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
}
