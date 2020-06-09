package lecture7class;

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

    // ------ Data ----- //
    String studentName;  // every Alphaleaf student has a name
    int studentId;       // every Alphaleaf student has a unique 6 digit student ID
    double gpa;          // every Alphaleaf student has current gpa with them
    boolean terminated; // every Alphaleaf student has info on whether he/she has terminated or not


    // ----- Constructors ------//
    // These are very special methods called constructor
    // that are called during object creation
    // calling this method right after the 'new' keyword
    // will result in object creation of this class.
    public AlphalefStudent() {
        studentName = "";
        studentId = 0;
        gpa = 0.0;
    }

    public AlphalefStudent(String name, int id, double gpa) {
        studentName = name;
        studentId = id;
        this.gpa = gpa;
    }

    // ----- Methods ---------//
    /**
     *
     * @param newGpa
     */
    public void modifyGpa(double newGpa) {
        if(newGpa < 0 && newGpa > 4) {
            throw new IllegalArgumentException("Input gpa value out of range.");
        }
        this.gpa = newGpa;
    }

    /**
     *
     * @return
     */
    public String getStudentInfo() {
        String nameInfo = "Student full name: " + studentName;
        String idInfo =  "Student 6 digit ID: " + studentId;
        String academyHealth = "";
        if(gpa > 2.0) {
            academyHealth = "Student has good academic standing";
        }else{
            academyHealth = "Student has poor academic standing and in danger or termination.";
        }

        String info = nameInfo + idInfo + academyHealth;
        return info;
    }

    /**
     *
     */
    public void terminateStudent()  {
        if(gpa >= 1.0) {
            System.out.println("Administrative error! You cannot terminiate this student.");
            System.out.println("This student has gpa more than 1.0. This process was recorded.");
            return;
        }
        this.studentId = 0;
        this.studentName = null;
        gpa = 0;
    }
}
