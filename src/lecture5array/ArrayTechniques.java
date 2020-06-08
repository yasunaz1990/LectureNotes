package lecture5array;

import java.util.Arrays;

public class ArrayTechniques {

    public static void main(String[] args) {

        //1. Create an array with random value
        int[] randNums = new int[10];
        int size = randNums.length;  //or just int size = 10;

        for(int idx = 0; idx < size; idx++) {
            randNums[idx] = (int)( Math.random()*100 );
        }
        System.out.println(Arrays.toString(randNums));


        //2. Print the content of an array
        for(int idx = 0; idx < randNums.length; idx++) {
            System.out.print( randNums[idx] + "  ");
        }

        //3. Find the max value inside of an array
        int max = 0;
        for(int idx = 0; idx < randNums.length; idx++) {
            if(randNums[idx] > max) {
                max = randNums[idx];
            }
        }
        System.out.println("Max Number: " + max);


        //4. Compute the average of the values in array
        double sum = 0;
        for(int idx = 0; idx < randNums.length; idx++) {
            sum += randNums[idx];
        }
        double avg = sum / randNums.length;
        System.out.println("Average value: " + avg);


        //5. Reverse the content of an array
        int sizeOfArr = randNums.length;
        int lastIdx = sizeOfArr - 1;
        for(int i = 0; i < sizeOfArr/2; i++) {
            int temp = randNums[i];
            randNums[i] = randNums[lastIdx - i];
            randNums[lastIdx-i] = temp;
        }

        System.out.println(Arrays.toString(randNums));

    }
}
