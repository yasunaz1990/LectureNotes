package lecture5array;


import java.util.Arrays;

public class ArrayDemo {

    // Main method where CPU executes instructions
    public static void main(String[] args) {

        //        index:  0  1  2   3   4
        int[] numbers = { 8, 9, 10, 24, 35 };
        // #1.  size of the array
        // #2.  update 9  --> 27
        // #3.  update 35 --> 100
       // System.out.println(  Arrays.toString(numbers)   );

        //  0  1  2  3  4
        // [0, 0, 0, 0, 0]
        int[] numbersV2 = new int[5];
        System.out.println( numbersV2.length );
        System.out.println(  Arrays.toString(numbersV2)   );

        numbersV2[0] = 8;
        numbersV2[1] = 9;
        numbersV2[2] = 10;
        numbersV2[3] = 24;
        numbersV2[4] = 78;
        numbersV2[1] *= 10;
        numbersV2[4]--;

        System.out.println(  Arrays.toString(numbersV2)   );

        int lastIdx = numbersV2.length - 1;
        System.out.println(  "Last Element of Array: " + numbersV2[lastIdx] );
        // index boundry [0~4]
    }

}
