package lecture7_class;

/*
 *   Class is used to create our own custom data type
 *      - It is a container for related methods
 *      - It is a container for related data variables.
 *      - it is a blue print for an object
 *
 *      - Object is nothing but individual working copy of the
 *      - the codes enclosed int the class, and data variables
 */
public class AlphalefStudent {

    // ------------------- Fields ------------------- //
    private String studentName;   // every Alphaleaf student has a name
    private long studentId;       // every Alphaleaf student has a unique 9 digit student ID
    private double gpa;           // every Alphaleaf student has current gpa with them
    private boolean terminated;   // every Alphaleaf student has info on whether he/she has terminated or not



    // ------------------- Constructor(s) -------------------//
    // These are very special methods called constructor
    // that are called during object creation
    // calling this method right after the 'new' keyword
    // will result in object creation of this class.

    public AlphalefStudent() {

    }


    public AlphalefStudent(String name) {
        studentName = name;
        studentId = sidFromDatabase();
        gpa = 0.0;
        terminated = false;
    }

    // Helper method
    // Capability: generated unique student ID
    private long sidFromDatabase() {
        long sid = (long)(Math.random() * 100000000L);
        return sid;
    }

    public AlphalefStudent(String name, double gpa) {
        studentName = name;
        this.gpa = gpa;
        studentId = sidFromDatabase();
    }

    // ------------------- Methods -------------------//

    public void setGpa(double newGpa) {
        if(newGpa < 0 && newGpa > 4) {
            throw new IllegalArgumentException("Input gpa value out of range.");
        }
        // if the codes here is executed
        // that means that user of this method
        // has provided us valid GPA value [0.0 ~ 4.0]
        this.gpa = newGpa;
    }

    public double getGpa() {
        return this.gpa;
    }


    public void printStudentInfo() {
        System.out.println("\n====================");
        System.out.println("Student full name: " + studentName);
        System.out.println("Student short ID : " + getShortId());
        String academyHealth = "";
        if(gpa > 2.0) {
            System.out.println("Student has good academic standing");
        }else{
            System.out.println("Student has poor academic standing and in danger or termination.");
        }
        System.out.println("====================\n");
    }

    // Helper Method
    // Capability: hides the this students' student ID which
    // is sensitive information
    private long getShortId() {
        String id = String.valueOf(studentId);
        id = id.substring(3);
        long obsecuredId = Integer.valueOf(id);
        return obsecuredId;
    }


    public void terminateThisStudent()  {
        if(gpa >= 1.0) {
            System.out.println("Administrative error! You cannot terminiate this student.");
            System.out.println("This student has gpa more than 1.0. This process was recorded.");
            return;  // exit the methods, don't go further
        }
        this.studentId = 0;
        this.studentName = null;
        gpa = 0;
        // other utility codes like deleting student
        // from database could go here.
    }
}
