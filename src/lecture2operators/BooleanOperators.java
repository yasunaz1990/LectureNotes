package lecture2operators;

public class BooleanOperators {

    public static void sayHello()
    {
        System.out.println("Hello!");

    }

    // Main method, executed by CPU
    public static void main(String[] args) {
        //  Boolean operators
        //  This operator are foundation of logical expression, its syntax is as follows:
        //  [Boolean Data]  [boolean ops]  [Boolean Data] --------> [Boolean Data]
        //
        //  Types of boolean operators
        //  &&     AND
        //  ||     OR
        //  !      NOT

        // AND operator are greedy, it will only give us true back if both operands are true
        System.out.println(   true && true  );
        System.out.println(   true && false  );
        System.out.println(   false && true  );
        System.out.println(   false && false  );


        // OR operator are flexible, it will only give us false if both operands are false
        System.out.println(   true || true  );
        System.out.println(   true || false  );
        System.out.println(   false || true  );
        System.out.println(   false || false  );

        // NOT operator are just flips the boolean value
        System.out.println(  !true  );
        System.out.println(  !false );


        // One Complete Example
        boolean isCold = true;
        boolean isSnowing = false;
        System.out.println(  !(isCold && isSnowing)  );

        sayHello();

    }
}

