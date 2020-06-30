package lecture11_static;

public class StaticDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Nijat", 29);
        Person p2 = new Person("Ali", 29);
        Person p3 = new Person("Anna", 29);
        Person p4 = new Person("Merve", 29);

        Person.showAllPersonCount();
        Person.showAllPersonNames();

    }
}
