package test;

// ForEach - Simplifica la forma en que se recorre un arreglo
import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {1, 2, 5, 6};

        System.out.println("Listando edades usando For");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[i] = " + edades[i]);
        }

        System.out.println("Listando edades usando ForEach");
        for (int edad : edades) { // Sintaxis del forEach
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {
            new Persona("Maxi"),
            new Persona("Juani"),
            new Persona("Vale"),
            new Persona("Lucia")
        };
        System.out.println("Listando personas usando ForEach");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
    }

}
