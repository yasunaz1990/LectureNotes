package lecture2_operators;

public class ArithmeticPrefixPostfixOperators {

    public static void main(String[] args) {

        // Unary operators ( ++, -- )
        // This arithmetic operators only applies to the single variable.
        // ++  <==  this operator will increment the data value by one
        // --  <==  this operator will decrement the data value by one
        //
        // there are two ways of using these unary operators
        // prefix :  using this way applies the operations before any other pending operations
        // postfix:  using this way applies the operations after all the other pending operations are done

        // ---- prefix example ----
        int number = 10;

        // op1:  increment the value 10 to 11
        // op2:  display the content of number variable to the screen, which is now 11
        System.out.println(  ++number );


        // ---- postfix example ----
        int another = 20;

        // op1:  display the content of variable another to the screen, which is 20
        // op2:  increment the content of variable another by one.
        System.out.println(another++); // displays 20
        System.out.println(another);   // displays 21


    }
}
