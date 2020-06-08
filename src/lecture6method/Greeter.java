package lecture6method;

public class Greeter {


    // I want my user of this class
    // to be able to call this method
    public static void sayHiToMyClassRoom() {
        doingVeryTechyDisplayingMessage("Hi there Alphaef studetns");
        doingVeryTechyDisplayingMessage("Happy coding!!");
    }



    // This is our money earning, very techinal method
    // Helper method
    private static void doingVeryTechyDisplayingMessage(String message) {
        System.out.println(message);   // <------- very very technical
    }


}
