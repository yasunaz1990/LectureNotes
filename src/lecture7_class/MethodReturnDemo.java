package lecture7_class;

public class MethodReturnDemo {

    //CPU: main
    public static void main(String[] args) {


        sayHello();

    }


    public static String sayHello() {
        System.out.println("Hello");
        System.out.println("hello");

        if(10 > 2) {
            return "Hello";
        }

        System.out.println("HELLOOOOO");
        return "hello";
    }

}


// Exiting from the method    usage of return
// 1. the end of the method '}' is reached
// 2. a return statement was encountered
// 3. an error happend