//ISSUE #91  - avm
//
// import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {



        Scanner entrada = new Scanner(System.in);
        System.out.println("******** Aplicación Calculadora ********");
        //Mostramos el menu
        System.out.println("""
                1. Suma
                2. REsta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("operacion a realizar?");
        var operacion = Integer.parseInt(entrada.nextLine());

        if (operacion >= 1 && operacion <= 4) {
            System.out.print("Digite el valor para el operando1 :");
            var operando1 = Integer.parseInt(entrada.nextLine());
            System.out.print("Ingrese valor para el operando 2: ");
            var operando2 = Integer.parseInt(entrada.nextLine());
            int resultado;
            switch (operacion) {
                case 1 -> {
                    resultado = operando1 + operando2;
                    System.out.println("Resultado de la suma:" + resultado);
                }
                case 2 -> {
                    resultado = operando1 - operando2;
                    System.out.println("Resultado de la resta:" + resultado);
                }
                case 3 -> {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado de la division:" + resultado);
                }
                case 4 -> {
                    resultado = operando1 * operando2;
                    System.out.println("Resultado de la multiplicacion:" + resultado);
                }
                default -> System.out.println("Opcion erronea: " + operacion);
            }//fin switch
        }
        else if (operacion == 5) {
                System.out.println("hasta pronto ...");
        }
        else {
                System.out.println("'opcion erronea!" + operacion);
        }

    } //Fin class
}
