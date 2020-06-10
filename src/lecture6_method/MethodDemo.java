package lecture6_method;

public class MethodDemo {
    
    // Main methodm only place CPU execute
    public static void main( String[] args ) {

        //saySomethingOnce();

        //saySomthing(8, "hg");

        // User of the method, interface
        int randomeNumber =  getRandNumberBetween0And100();
       // System.out.println(randomeNumber);

        // 0 ~ 9
        int ret = getRandNumberBetween0AndYourChoise(10);
        System.out.println(ret);
    }


    // Designers of this metohd
    // method:  this method will return a random whole number starting from 0 to
    //          whatever the number that is greater than 0 you wish, however, that number
    //          is exclusing
    // usaeg;;  invoke a mthod and provide number upto whihc you would like too rand num generated
    public static int getRandNumberBetween0AndYourChoise(int userChoice) {
        int result = (int)(Math.random() * userChoice);  // 0~99
        return result;
    }

    // Designer of this method
    // method:  this method will give us one random whole number
    //          between 0~99
    // usage :  just invoke this method
    public static int getRandNumberBetween0And100() {
        int result = (int)(Math.random() * 100);  // 0~99
        return result;
    }



    // DRY         <========= Don't Repeat Yourself
    // ABSTRACTION <========= # 1 Coding & Interview Question
    // Arguments, input to the method


    // Designer of the mothod
    // methods: it prints "HELLO ALPHALEF" number of times
    //          to the terminal window that user has chosen
    //
    // usage  :  just invoke this mehtod, provide how many times
    //           message should be displayed to the screen
   public static void saySomthing(int userDesiredCount, String usersCustomMessage) {
       for(int i=0; i <userDesiredCount; i++) {
           System.out.println(usersCustomMessage);
       }

       System.out.println(); // types out one empty line
   }

   // Type 1, no input, no returning data, it just
    // executes inside the method for you
   public static void saySomethingOnce(){
       System.out.println("yoo nijat");
   }



}
