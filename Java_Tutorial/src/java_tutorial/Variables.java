package java_tutorial;

public class Variables {

    /*
     * Variables Java
     * Las variables son contenedores para almacenar valores de datos.
     * En Java, existen diferentes tipos de variables, por ejemplo:

       * String- almacena texto, como "Hola". Los valores de cadena están entre comillas dobles
       * int- almacena enteros (números enteros), sin decimales, como 123 o -123
       * float- almacena números de coma flotante, con decimales, como 19.99 o -19.99
       * char- almacena caracteres individuales, como 'a' o 'B'. Los valores de char están entre comillas simples
       * boolean- almacena valores con dos estados: verdadero o falso
     */

    //  Declarar (crear) variables

    // type variableName = value;
    public static void main(String[] args) {
        // String name = "John";
        // System.out.println(name);

        // Para crear una variable que deba almacenar un número, observe el siguiente ejemplo:

        // int nyNum = 15;
        // System.out.println(nyNum);


        // También puede declarar una variable sin asignar el valor y asignar el valor más tarde:

        // int myNum;
        // myNum = 15;
        // System.out.println(myNum);


        // Tenga en cuenta que si asigna un nuevo valor a una variable existente, sobrescribirá el valor anterior:

        // int nyNum = 15;
        // nyNum = 20; // myNum is now 20
        // System.out.println(nyNum);

//         Variables finales
        //  Si no desea que otros (o usted mismo) sobrescriban los valores existentes, use la finalpalabra clave (esto declarará la variable como "final" o "constante", lo que significa que no se puede modificar y es de solo lectura):

        // final int myNum = 15;
        // myNum = 20; // generará un error: no se puede asignar un valor a una variable final Inténtalo tú mismo"


//         Otros tipos
        // Una demostración de cómo declarar variables de otros tipos:

        // int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // Variables de impresión
      /*
       * Mostrar variables
       * El println()método se utiliza a menudo para mostrar variables.
       * Para combinar texto y una variable, use el +carácter:
       * 
       */

      //  Ejemplo
      String name = "John";
      System.out.println("Hello " + name);


      // También puede usar el +carácter para agregar una variable a otra variable:
      String firstName = "John ";
      String lastName = "Doe";
      String fullName = firstName + lastName;
      System.out.println(fullName);


      // Para valores numéricos, el +carácter funciona como un operadorint matemático (observe que aquí usamos variables (enteras)):

      // Ejemplo
      
      int x = 5;
      int y = 6;
      System.out.println(x + y); // Print the value of x + y











    }
}
