package lecture7_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OtherPeoplesClassUsage {

    public static void main(String[] args) {

        // ------- Date Class -----------------//
//        Date dateObject = new Date();                 // Representation of idea called Date
//        String currentDate = dateObject.toString();   // Getting a current date when this code is executed
//        System.out.println(currentDate);


        String formatILove = "YYYY/MM/dd HH:mm:ss";
        String formatDetaild = "YYY-MM-dd  HH:mm:ss";

        //SimpleDateFormat desiredDateFormat = new SimpleDateFormat(formatILove);

        while (true) {
            Date dateObject = new Date();
            SimpleDateFormat desiredDateFormat = new SimpleDateFormat(formatDetaild);
            String currentDate = desiredDateFormat.format(dateObject);
            System.out.print(currentDate + "\r");
            pause();
            if (currentDate.contentEquals("2020-06-10  01:02:20")) {
                System.out.println("Times up!!!!");
                break;
            }
        }

//        currentDate = desiredDateFormat.format(dateObject).toString();
//        System.out.println(currentDate);


        // ------- String class -----------------//


        // ------- Array Class -------------------//


    }

    public static void pause() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // Do nothing
        }
    }
}


// "YYYY/MM/dd HH:mm:ss"


