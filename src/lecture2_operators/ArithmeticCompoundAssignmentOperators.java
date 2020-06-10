package lecture2_operators;

public class ArithmeticCompoundAssignmentOperators {

    public static void main(String[] args) {

        // Compound assignment is result of fusing assignment operator and basic arithmetic
        // operator into single operator.
        // as a result, it achieves tow operations.

        // It simply performs basic arithmetic operations and assigns the result back to
        // the operand variable.  It is just used for updating the content of the
        // operand variable.  ( note:  operand variable is the variable where this operator are working against )

        // +=   : update by addition
        // -=   : update by subtraction
        // *=   : update by multiplication
        // /=   : update by division
        // %=   : update by modular

        // --- Example
        int number = 10;

        // update the value in number by adding 20
        number += 20;
        System.out.println(number);

        // update the value in number by subtracting 15
        number -= 15;
        System.out.println(number);

        // update the value in number by multiplying 5
        number *= 5;
        System.out.println(number);

        // update the value in number by dividing 5
        number /= 5;
        System.out.println(number);

        // update the value in number by modulus 10
        number %= 10;
        System.out.println(number);
    }
}
