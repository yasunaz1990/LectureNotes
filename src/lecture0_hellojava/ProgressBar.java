package lecture0_hellojava;

import java.util.Scanner;




// This class contains a simple
// Terminal progress bar graphic program
// At line 14, execute it to start using this
// demo program.  You don't need to understand what is going here.
public class ProgressBar {

    // Main method - where CPU executes code
    public static void main(String[] args) {
        // Get user number input
        Integer userInput;
        do{
            System.out.print("\rEnter Progress Bar Limit: ");
            userInput = new Scanner(System.in).nextInt();
            pause(50);
            if(userInput > 100 || userInput < 0){
                System.out.print("\r** Only Number Between 0 and 100 TRY AGAIN! **");
                pause(1300);
                continue;
            }
        }while(userInput < 0 || userInput > 100);

        for (int i = 0; i < 6; i++) {
            pause(250);
            if (i == 0 ) System.out.print("\r" + "Initiating Bar +");
            else if(i == 1) System.out.print("\r" + "Initiating Bar **");
            else if(i == 2) System.out.print("\r" + "Initiating Bar +");
            else if(i == 3) System.out.print("\r" + "Initiating Bar ***");
            else if(i == 4) System.out.print("\r" + "Initiating Bar +");
            else if(i == 5) System.out.print("\r" + "Initiating Bar ****");
        }
        System.out.println("\rBar Initiated");

        // Move progress bar up to the number
        for (int i = 0; i <= userInput; i++) {
            String ret = progressBar(i);
            System.out.print("\r" + ret);
        }
    }

    // Helper Method
    // Put execution thread to sleep
    // for 500 milliseconds
    // this will not work for multi-threadding env
    private static void pause(int number) {
        try {
            Thread.sleep(number);
        } catch (Exception e) {
            // Do Nothing
        }
    }

    private static String progressBar(long currentPosition) {
        String bar = "";
        int nPositions = 50;
        int startPositoin = 0;
        char pb = '░', stat = '█';
        String sym = "+";
        for (int p = 0; p < nPositions; p++) {
            bar += pb;
        }
        pause(100);
        int ststus = (int) (100 * (currentPosition - startPositoin) / (100 - startPositoin));
        int move = (nPositions * ststus) / 100;
        String result = "[" + bar.substring(0, move).replace(pb, stat) + sym +  bar.substring(move, bar.length()) + "]" + ststus + "%";
        return result;
    }

}