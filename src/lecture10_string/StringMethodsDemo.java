package lecture10_string;

public class StringMethodsDemo {


    // main method
    public static void main(String[] args) {

        // Member Methods - belongs to Object

        // equals()

        // equalIgnoreCase()

        // compareTo()

        // compareToIgnoreCase()

        // split()

        // contains()

        // Class methods - belongs to class only  ( Static )

        // String.join();
        String[] words = { "Hi", "there", "Alphaleaf"};
        String oneWord = String.join("-", words);
        System.out.println(oneWord);

        // String.valueOf(data-type)
    }
}
