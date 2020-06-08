package lecture6method;

public class MethodPractice {

    // Main method where CPU will execute your code
    public static void main(String[] args) {

        System.out.print("hello");
        String line = System.lineSeparator();
        System.out.println(line);
        System.out.print("hello");
        isEvenNumber(90);
    }

/*
   syntax of creating a method

    [access-modifier] <static> [ReturnType] methodName(list of tem variables) {
         method body
    }

 */

    // Method
    // write code that
    // return true if the user input number is even number
    // return false if the user inout number is not even number
    public static boolean isEvenNumber(int number) {

        if(number % 2 == 0) {
            return true;
        }

        return false;
    }

}
