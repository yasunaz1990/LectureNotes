package lecture11_static;

public class StaticDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Nijat", 29);
        Person p2 = new Person("Ali", 29);
        Person p3 = new Person("Anna", 29);
        Person p4 = new Person("Merve", 29);

        Person.showAllPersonCount();
        Person.showAllPersonNames();

        // Using ConsoleMessenger class
        ConsoleMessenger.blocker("We found an error!");
        ConsoleMessenger.warning("We found an potential erro!");

        // Using bar
        ConsoleMessenger.displayBlocks(10, "Ford");
        ConsoleMessenger.displayBlocks(20, "Toyota");
        ConsoleMessenger.displayBlocks(40, "Amazon");
        ConsoleMessenger.displayBlocks(15, "Microsoft");
        ConsoleMessenger.displayBlocks(5, "Nissan");


    }
}
