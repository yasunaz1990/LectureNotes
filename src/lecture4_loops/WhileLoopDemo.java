package lecture4_loops;

public class WhileLoopDemo {


    // Main method where CPU executes instructions
    public static void main(String[] args) {


        int index = 0;

        //     true     index=4
        while(index++ < 10) {
            System.out.println("index:" + index);

            int rem = index % 2;
            if(rem == 0) {
                continue;
            }

            System.out.println("Content of index var: " + index);
            System.out.println();
        }



    }//end::main()
}
