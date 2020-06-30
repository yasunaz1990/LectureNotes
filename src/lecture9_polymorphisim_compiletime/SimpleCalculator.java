package lecture9_polymorphisim_compiletime;

/**
 Types of Polymorphism:
 -----------------------
 In Java, Polymorphism can be divided into two types:

 - Run-time Polymorphism
 - Compile-time Polymorphism *

 Compile-time Polymorphism
     The compile-time polymorphism can be achieved through method overloading in Java.

 In the Java programming language,
 a method signature is the:
    - method name
    - number of parameter variables
    - types  of parameter variabels
    - order of parameter  variabls from left to right
Note that Return types are not considered to be a part of the method signature.

 */


public class SimpleCalculator {

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public void add(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    public void add(String w1, String w2) {
        String oneWord = w1 + w2;
        System.out.println(oneWord);
    }
}
