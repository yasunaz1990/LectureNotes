package lecture10_string;

import java.util.Arrays;

public class StringMethodsDemo {


    // main method
    public static void main(String[] args) {
        // Let us experience Abstraction
        // Thanks to the creater of this amazing Class called
        // String which let us represent text data in our program.

        String myName = new String("Nijat");
        String myFrinedName = new String("NIJAT");
        String yourName = new String("John");
        String allMonths = "Jan Feb Mar April May Jun Jul Aug Sep Oct Nov Dec";


        // equals()
        boolean result = myName.equals(yourName);
        System.out.println(result);

        // equalIgnoreCase()
        result = myName.equalsIgnoreCase(myFrinedName);
        System.out.println(result);

        // compareTo()
        int comparisonValue = myName.compareTo(myFrinedName);
        System.out.println(comparisonValue);

        // compareToIgnoreCase()
        comparisonValue = myName.compareToIgnoreCase(myFrinedName);
        System.out.println(comparisonValue);

        // split()
        String[] months = allMonths.split(" ");
        System.out.println(Arrays.toString( months ) );
        System.out.println( months[1] );

        // contains()
        boolean exist = allMonths.contains("Feb");
        System.out.println(exist);

        // substring()
        //              01234
        String words = "Hello";


        // Class methods - belongs to class only  ( Static )

        // String.join();
        String[] someWords = { "Hi", "there", "Alphaleaf"};
        String oneWord = String.join("-", someWords);
        System.out.println(oneWord);

        // String.valueOf(data-type)
        double myMoney = 890.98;
        String myMoneyAsText = String.valueOf(myMoney);

        char[] characters =  myMoneyAsText.toCharArray();
        System.out.println(Arrays.toString(characters));

    }
}
