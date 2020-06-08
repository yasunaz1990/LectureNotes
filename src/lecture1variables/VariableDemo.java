package lecture1variables;

public class VariableDemo {

    // Main method, executed by CPU
    public static void main(String[] args) {

        // Being able to represent actual data human
        // uses in java program is cool !
        // But...we need a way to store the these data.
        // Variable let us just do that

        // Variable is named data storage in you RAM
        // The value it contains is strongly restricted to the one you
        // specified when you create this data storage
        // the value it contains can be changed as long as new value
        // is of same type with the variable

        // example
        int myAge = 30;
        // int  :  dat type of this variable
        // myAge:  name of this variable
        // =    :  assignment operator
        // 30   :  data value
        // ;    :  semicolon to let CPU know that one instruction has ended

        // Remember we are able to use these data in Java right
        // Whole number        ( byte, short, int, long )
        byte hour = 12;
        short speed = 13909;
        int altitude = 32423423;
        long population = 24234234234L;  // don't forget the L character at the end

        // Fraction numbers    ( float, double )
        float weight = 190.3F;          // don't forget the F character at the end
        double weightOfEarth = 2343243423234.34234;

        // Boolean data        ( boolean )
        boolean isCold = false;
        boolean isFun = true;

        // Character data      ( char )
        char grad = 'F';
        char suprisedSymbol = '!';
        char space = ' ';

        // String data         ( String )
        String message = "String is sequece of chars";
        String longMessage = "It can be many lines of text, provided enclose on double quotes";

    }
}
