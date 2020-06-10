package lecture4_loops;


public class ForLoopDemo {

    // Main method where CPU executes instructions
    public static void main(String[] args) {

        //
        // I want you to skip even numbers
        // hit:  if,   %,  continue
        for(int idx = 1;  idx <= 20; idx++)
        {
            if( idx % 2 == 0) {
                System.out.print("*  ");
                continue;
            }

            System.out.print(idx + "   ");
        }

    }

}