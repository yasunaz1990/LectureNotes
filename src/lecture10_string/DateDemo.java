package lecture10_string;

import com.sun.codemodel.internal.JCatchBlock;
import javafx.animation.ScaleTransition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateDemo {

    public static void main(String[] args) {


        // Getting today's date
        Date dateObject = new Date();
        String today = dateObject.toString();
        System.out.println("Date: " + today );


        // Displaying the today's date with most used format
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.S");
        String currentDate = dateFormat.format(dateObject);
        System.out.println(currentDate);


        // Very simplest way of doing the same thing
        String date = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.S").format(new Date());
        System.out.println("Short Version: " + date);


        // Watch Example
        while (true) {
            Date dateObj = new Date();
            SimpleDateFormat desiredDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            String currentTime = desiredDateFormat.format(dateObj);
            System.out.print(currentTime + "\r");
            pause();
//            if (currentDate.contentEquals("2020-06-10  01:02:20")) {
//                System.out.println("Times up!!!!");
//                break;
//            }
        }


    }

    // Tells CPU to pause for 1 seocond == 1000 mili-second
    public static void pause() {
       try {
           Thread.sleep(1000);
       }
       catch (Exception e){
           System.out.println("Something went wrong with CPU");
       }
    }
}
