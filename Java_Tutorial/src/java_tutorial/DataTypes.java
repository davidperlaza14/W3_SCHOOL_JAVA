package java_tutorial;

/**
 * Tipos de datos Java
 * 
 * @author David Stiven
 */
public class DataTypes {

    public static void main(String[] args) {
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String    
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);




        // Ensanchamiento de fundición
        // La fundición ampliada se realiza automáticamente al pasar un tipo de tamaño más pequeño a un tipo de tamaño más grande:

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);





        // Fundición de estrechamiento
        // La conversión de estrechamiento debe hacerse manualmente colocando el tipo entre paréntesis delante del valor:

        double myDoublee = 9.78d;
        int myIntt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDoublee);   // Outputs 9.78
        System.out.println(myIntt);      // Outputs 9






    }
    
}
