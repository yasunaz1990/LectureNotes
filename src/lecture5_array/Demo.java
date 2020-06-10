package lecture5_array;


public class Demo
{

    // type 1: perform
    public static void sayHi() {
        System.out.println("Hi");
    }

    // type 2: perform, asks for input
    public static void saysHelloToTheScreen(int num) {
        for(int i=0; i<num; i++) {
            System.out.println("Hello guys!!!");
        }

    }

    // type3: It will return a data, but won't ask any input
    public static String getProfessorName() {
        String name = "Yala habibi";
        return name;
    }

    // type 4:  It will return data, also will ask for input
    public static  int sum(int f, int s) {
        int result = f + s;
        return  result;
    }


    // Main method, CPU executes here
    public static void main(String[] args) {
        int dataFromMethod = sum(100, 1223);
        System.out.println(dataFromMethod);
    }
}
