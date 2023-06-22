import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {

        // Creamos nuevo objeto Scanner para entrada de datos por teclado
        Scanner entrada = new Scanner(System.in);

        // Una lista de tipo Persona para guardar personas
        List<Persona> personas = new ArrayList<>();

        // Test clase Persona
        Persona persona1 = new Persona("Maxi", "12345", "mchalin@email.com");
        personas.add(persona1);
        System.out.println("persona1 = " + persona1);

        // Menú
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println();
        } // Fin del ciclo while

    } // Fin del método main()

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas) {
        int opcion = Integer.parseInt(entrada.nextLine());
        boolean salir = false;

        switch (opcion) {
            case 1 -> { // Agregar persona

                System.out.println("Agregar persona: ");
                System.out.print("Ingrese el nombre: ");
                String nombre = entrada.nextLine();
                System.out.print("Ingrese el teléfono: ");
                String telefono = entrada.nextLine();
                System.out.print("Ingrese el email: ");
                String email = entrada.nextLine();

                Persona persona = new Persona(nombre, telefono, email);
                personas.add(persona);
                System.out.println("La lista personas ahora tiene " + personas.size() + " elementos.");
            } // Fin case 1

            case 2 -> { // Listar personas
                System.out.println("Listando personas: ");

                // Utilizando lambda
                // personas.forEach(persona -> System.out.println(persona));

                // Utilizando método de referencia (::)
                // Por cada objeto Persona q tiene la lista, manda a imprimir la linea (println)
                personas.forEach(System.out::println);

            } // Fin case 2

            case 3 -> { // Salir
                System.out.println("Saliendo..");
                salir = true;
            } // Fin case 3

            default -> { // Caso por default
                System.out.println("Opción seleccionada incorrecta: " + opcion);
            } // Fin case default

        } // Fin del switch

        return salir;
    } // Fin del método ejecutarOperacion()

    private static void mostrarMenu() {
        System.out.println("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Ingrese una opción: ");
    } // Fin del método mostrarMenu()

} // Fin de la clase ListadoPersonasApp
