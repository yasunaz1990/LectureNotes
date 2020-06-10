package lecture2_operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Basic Operators +, -, /, *, %
        //
        // +    : addition        number + number ----> number
        // -    : subtraction     number - number ----> number
        // /    : division        number / number ----> number
        // *    : multiplication  number * number ----> number
        // %    : modular         number % number ----> number

        int number = 10;
        int another = 20;

        // example
        int sum = number + another;
        int sub = another - number;
        int div = another / number;
        int mul = number * another;
        int mod = another % number;


        System.out.println("adding two numbers     : " + sum);
        System.out.println("subtracting two numbers: " + sub);
        System.out.println("dividing tow numbers   : " + div);
        System.out.println("multiplying tow numbers: " + mul);
        System.out.println("Modulus of tow numbers : " + mod);
    }
}
