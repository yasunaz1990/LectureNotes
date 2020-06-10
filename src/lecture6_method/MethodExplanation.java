package lecture6_method;

public class MethodExplanation {

    // Main - function   CPU will exeucte code inside of here

    public static void main(String[] args)
    {
        // I am calling one of the methods written below.
        int result = getRandomNumber(5);
        System.out.println(result);
    }


    // Methods are block of isolated code that can
    // be used else where in our project by just calling their name
    // only 4 different types of methods exist
    // our primary goal is to recognize these different types
    // of methods so that we can easily understand when we use
    // other people's amazing methods.


    /*
        method signature:

        [access-modifier] static [return-data type]  methodName( parameter-list ) {

             // method body
        }

         access-modifier:  public, private, protected
                  static:  means not part of object
        return-data type:  so far (int, double, String, char, boolean)
          parameter-list:  list of temp variables that are used to store user input data to the method

     */


    // Type 1:  no data, no input
    public static void saySomething() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello Imran!");
        }
    }

    // Type 2:  no data, input
    public static void saySomething(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("hello Imran!");
        }
    }

    // Type 3: data, no input
    public static int getRandomNumber() {
        int num = (int)(Math.random() * 100);  // 0 ~ 99
        return num;
    }

    // Type 4: data, input
    public static int getRandomNumber(int limit) {
        limit++;
        int num = (int)(Math.random() * limit);
        return num;
    }
}
