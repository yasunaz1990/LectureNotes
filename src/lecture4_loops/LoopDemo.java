package lecture4_loops;

public class LoopDemo {

    // main method where CPU reads
    public static void main(String[] args) {

        // While loop part 2
        // -------------------------------
        // starting from 1
        // counting up to the value in second variable
        int input = 5;
        int i = 1;

        while(i <= input) {
            System.out.println(i);
            i++;
        }


        // While loop part 3
        // -------------------------------
        // starting from 10, count down
        int n = 10;
        while(n > 1) {
            // System.out.println(n);
            n--;
        }


        // While loop part 5, usage of infinite loop
        // --------------------------------
        while(true) {

            // Get a random number between 0 and 1
            double randValue = Math.random();
            System.out.println(randValue);

            // breaks the loop, if randValue is greater
            // than 0.8
            if(randValue >= 0.8) {
                break;
            }
        }
    }
}
