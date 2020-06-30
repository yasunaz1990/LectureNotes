package lecture11_static;

public class Person {
    // ---- Static Fields --- //
    private static int personCount;
    private static String[] names = new String[100];
    private static int idx = 0;

    // --- Fields ---- //
    private String name;
    private int age;


    // --- Constructors --- //
    public Person() {
        personCount++;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
        personCount++;
        names[idx++] = n;
    }


    // --- Methods  ----//
    public void printInf() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }


    // --- Static Methods --//
    static public void showAllPersonCount() {
        System.out.print("All person count: " + personCount);
        // System.out.println("Person name   : " + this.name);   <-- error!
        // printInf();                                           <-- error!
    }

    static public void showAllPersonNames() {
        System.out.println("\n\nNames of all person: ");
        System.out.println("-------------------------");
        for (String name : names) {
            if (name == null) {
                continue;
            }
            System.out.print(name + "  ");
        }
        System.out.println("\n-------------------------\n");
    }

    static public int getRandAge() {
        return 78;
    }



}

// Static Keypoints:
// Member variable, member method & Contructors can use Static Variable, or methods
// Static method cannot use member variables or memeber methods since they belong to Object