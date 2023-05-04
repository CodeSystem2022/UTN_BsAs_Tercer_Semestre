package test;

// Clase envolvente o wrapper
public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        /*
        Primitive type      Wrapper class
        boolean             Boolean
        byte                Byte
        char                Character
        float               Float
        int                 Integer
        long                Long
        short               Short
        double              Double
         */

        int enteroPrimitivo = 10; // Tipo Primitivo
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);

        Integer enteroInteger = 10; // Tipo Object
        System.out.println("enteroInteger = " + enteroInteger);

        System.out.println(enteroInteger.getClass());

        // Autoboxing, transformar un tipo Object 
        System.out.println(enteroInteger.doubleValue());

        // Unboxing, transformar un tipo primitivo
        int entero2 = enteroInteger;
        System.out.println("entero2 = " + entero2);

    }

}
