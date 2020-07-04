package lecture13_exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {


    public static void main(String[] args) {


        int num = 102;
        int b   = 0;

        try{
            int result = num / 0;
        }
        catch (Exception e){
            System.out.println("Dividing by zero is error!");
        }


        try {
            String path = System.getProperty("user.dir") + "/src/lecture13_exceptions/greeting.txt";
            FileReader freader = new FileReader(path);
            int i;
            while ((i = freader.read()) != -1)
                System.out.print((char) i);

        }catch (IOException e){
            // Do nothing
        }
    }
}
