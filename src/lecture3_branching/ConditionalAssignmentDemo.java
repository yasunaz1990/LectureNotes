package lecture3_branching;

public class ConditionalAssignmentDemo {

    public static void main(String[] args) {

        // Assignment
        int num = 10;

        // Conditional Assignment
        // Syntax of the conditional assignment
        //
        // [variable] = (condition)? case_true : case_false;
        //
        //  1. condition is analyzed,  if the value is true, then whatever the data in case_true part is
        //     assigned to the variable.  If the value is false, the whatever the data in case_false part
        //     is assigned to the variable.


        double students = 65;
        double roomsWeHave = 0;

        double studentsPerRoom = (roomsWeHave == 0)? 0.0 : students/roomsWeHave;
        System.out.println(studentsPerRoom);

    }
}
