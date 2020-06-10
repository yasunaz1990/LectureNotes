package lecture1_variables;

public class DataTypeDemo {

    // Main method, executed by CPU
    public static void main(String[] args) {

        // Out of the box, java offers us a way to represent
        // following actual data human uses as a code
        // --------------------------------------------------
        // Whole Numbers    : -10,  -5,  0,  1,  11,  1203
        // Fraction Numbers : -10.0, -5.68, 0.0, 0.11, 1.2, 13432.9
        // Logic            :  Right, Wrong
        // Characters       :  A, a, !, ~, ? #
        // Text             :  The quick brown fox jumps over the lazy dog
        //
        //  These data are represented with following data types in Java
        // --------------------------------------------------
        // Whole Numbers    :   int      others including ( byte, short, long )
        // Fraction Numbers :   double   others including ( float )
        // Logic            :   boolean
        // Characters       :   char
        // Text             :   String
        // Example
        System.out.println(87);        // that 87 is represented as integer internally.
        System.out.println(89.99);     // that 88.99 is represented as double internally.
        System.out.println(true);      // that true is represented as boolean internally.
        System.out.println('A');       // that 'A' is represented as char internally.
        System.out.println("Hi There!"); // that "Hi There!" is represented as String internally.



    }
}
