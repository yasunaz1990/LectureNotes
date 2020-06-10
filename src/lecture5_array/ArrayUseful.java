package lecture5_array;


public class ArrayUseful {

    public static void main(String[] args) {

        // 1 ~ 12
        int m = 8;


        // first part
        if      (m ==  1) System.out.println("Jan");
        else if (m ==  2) System.out.println("Feb");
        else if (m ==  3) System.out.println("Mar");
        else if (m ==  4) System.out.println("Apr");
        else if (m ==  5) System.out.println("May");
        else if (m ==  6) System.out.println("Jun");
        else if (m ==  7) System.out.println("Jul");
        else if (m ==  8) System.out.println("Aug");
        else if (m ==  9) System.out.println("Sep");
        else if (m == 10) System.out.println("Oct");
        else if (m == 11) System.out.println("Nov");
        else if (m == 12) System.out.println("Dec");


        // instead of that
        //                 0    1       2      3     4      5       6      7     8      9       10    11     12
        String[] MONTHS = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(  MONTHS[m]  );


    }
}
