package lecture8_inheritance;

import lecture7_class.AlphalefStudent;

public class InheritanceDemo {

    // Main method
    public static void main(String[] args) {

        AlphalefStudent ali = new AlphalefStudent();

        OmegaStudent nijat = new OmegaStudent();
        nijat.setGpa(6.89);
        nijat.printStudentInfo();


    }

}


