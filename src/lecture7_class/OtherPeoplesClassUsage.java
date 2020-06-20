package lecture7_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OtherPeoplesClassUsage {

    public static void main(String[] args) {

        // ------- Date Class -----------------//
        Date date = new Date();         // Representation of idea called Date
        String today = date.toString(); // Getting a current date when this code is executed
        System.out.println(today);


        // Date format we are interested in
        // Displaying the date string with formated way
        String formatDetaild = "YYYY-MM-dd  HH:mm:ss";
        SimpleDateFormat desiredDateFormat = new SimpleDateFormat(formatDetaild);
        String todaysDate = desiredDateFormat.format(date);
        System.out.println("formatted date: " + todaysDate);


        // Creating a stop watch
        String targetDate = "2020-06-10  01:02:20";
        while (true) {
            Date dateObject = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat(formatDetaild);
            String currentDate = formatter.format(dateObject);
            System.out.print(currentDate + "\r");
            pause();
            if (currentDate.contentEquals(targetDate)) {
                System.out.println("Times up!!!!");
                break;
            }
        }
    }

    /*
     * Pauses execution thread for 1 second
     */
    public static void pause() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // Do nothing
        }
    }
}



