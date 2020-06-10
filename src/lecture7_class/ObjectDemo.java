package lecture7_class;

public class ObjectDemo {


    // Main method
    public static void main(String[] args) {

        // This AlphaleafStudent object will represent real student of
        // Alphaleaf Techschool in our java program.
        AlphalefStudent ali = new AlphalefStudent("Ali Nazari");
        ali.setGpa(3.4);
        ali.printStudentInfo();
        ali.terminateThisStudent();
        ali.printStudentInfo();
    }
}
