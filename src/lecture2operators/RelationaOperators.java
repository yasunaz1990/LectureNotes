package lecture2operators;

public class RelationaOperators {

    public static void main(String[] args) {

        // Numerical Data Types ( integer, double ) has another operator that
        // compares two numerical data and give us boolean data as a result of operations
        // Relational Operators
        //     >        greater than
        //     >=       greater than or equal to
        //     <        less than
        //     <=       less than or equal to
        //     ==       equal to
        //     !=       not equal
        //    5 < 10 ===> true,false
        //    5 + 10 ===> 15

        int a = 27 / 4 + 9;     // a=15
        System.out.println(a);
        int b = 52 / 6 - 2;     // b=6
        System.out.println(b);
        int c = 3;

        c = a++ - b;          // c = 9
        a = a * b;            // a = 96
        System.out.println(a);
        b = b + a;
        boolean result = a < c;  //( 96 < 9)  ---> false

        // Control Statements
        // if statement
        if( result) {
            System.out.println("Alphaleaf all the way!");
        }
        else {
            System.out.println("Summer vacation is the best");
        }
    }
}
