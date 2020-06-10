package lecture3_branching;

public class BranchingDemo {
    // if statement
    // if-else statement
    // chaining if-else statement
    public static void main(String[] args) {

//        System.out.print("Select a grade [ A, B, C]: ");
//        Scanner keyboard = new Scanner(System.in);
//        String choice = keyboard.nextLine();

        boolean isCold = true;

        // single if statement accepts boolean value (true or false)
        // in its condition part.  if the boolean value is true
        // the code block under the if statement is executed.
        if(isCold) {
            System.out.println("Today is cold.");
        }


        // if-else statement accepts boolean value (true or false)
        // in its condition part.  If the boolean value is true, the code
        // block under the if statement is executed.
        // However, if the boolean value is false, the codde block under the else
        // statement is executed.
        if(!isCold) {
            System.out.println("Today is cold.");
        }else{
            System.out.println("It seems today is not cold.");
        }



        // Chaining if else statement has multiple conditions.
        // each of these condition are evaluated until one of them turns true
        // if one of the condition results in true, the code block just beneath
        // that condition is executed and rest of the code is ignored.
        //
        // if none of the condition is true, then the else block code is executed.
        // however, please note that else block is completely optional.
        String choice = "A";

        if (choice == "A") {
            System.out.println("You have passed");
        } else if (choice == "B") {
            System.out.println("You did so so ");
        } else if (choice == "C") {
            System.out.println("You have failed");
        } else {
            System.out.println("You did not read the instructions");
        }

        System.out.println("the is the end of it!!!!");

    }//end::main
}





