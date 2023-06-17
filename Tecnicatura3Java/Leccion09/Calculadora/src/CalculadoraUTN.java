import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {

        /*  Issue #90 
        Scanner entrada = new Scanner(System.in);
        System.out.println("******** Aplicación Calculadora ********");

        // Definiciones de variables
        System.out.print("Ingrese valor para el operando 1: ");
        var operando1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese valor para el operando 2: ");
        var operando2 = Integer.parseInt(entrada.nextLine());

        var resultado = operando1 + operando2;
        System.out.println("El resultado es: " + resultado);
        */

        while(true){

            Scanner sc = new Scanner(System.in);

            System.out.println();
            System.out.println("********** Aplicación Calculadora ***********");
            System.out.println();

           mostrarMenu();

            try {

                var operacion = Integer.parseInt(sc.nextLine());

                if(operacion >= 1 && operacion <= 4){

                    ejecutarOperación(operacion,sc);

                } else if (operacion == 5){

                    System.out.println("Hasta pronto...");
                    break; // Rompe el ciclo y sale

                } else {

                    System.out.println("Opción errónea: " + operacion);

                } // FIn if

                // Imprimimos un salto de linea antes de salir del ciclo
                System.out.println();

            }catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }

        } //Fin while

    } //Fin main

    private static void mostrarMenu(){

        //Mostramos el menú
        System.out.println(
                "1. Suma\n" +
                        "2. Resta\n" +
                        "3. Multiplicación\n" +
                        "4. División\n" +
                        "5. Salir\n"
        );

        System.out.print("Operación a realizar?: ");
    } // FIn mostrarMenu

    private static void ejecutarOperación(int operacion, Scanner sc){

        System.out.print("Digite el valor para el operando1: ");
        var operando1 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite el valor para el operando2: ");
        var operando2 = Double.parseDouble(sc.nextLine());

        double resultado;

        switch (operacion){
            case 1:
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma entre " + operando1 + " y " + operando2 + " es: " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta entre " + operando1 + " y " + operando2 + " es: " + resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicación entre " + operando1 + " y " + operando2 + " es: " + resultado);
                break;
            case 4:
                try {
                    resultado = operando1 / operando2;
                    System.out.println("El resultado de la división entre " + operando1 + " y " + operando2 + " es: " + resultado);
                }catch (ArithmeticException e){
                    System.out.println("No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Opción errónea: " + operacion);
        } //Fin switch
    } // Fin ejecutarOperacion

} //Fin class
