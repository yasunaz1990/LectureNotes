package lecture1variables;

public class VariableQuiz {

    // Main method -- only place CPU executes code
    public static void main(String[] args) {

        int myVar;
//        System.out.println(myVar);          // This is error, content of myVar is empty

        myVar = 50;
        System.out.println(myVar);             // <----- 50

        int anotherVar = 100;
        System.out.println(anotherVar);        // <----- 100

        myVar = anotherVar;
        System.out.println(myVar);             // <----- 100

        anotherVar = 200;
        System.out.println(anotherVar);        // <------ 200

        System.out.println(myVar);             // <------ 100
    }
}
