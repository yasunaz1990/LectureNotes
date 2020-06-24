package lecture9_polymorphisim_runtime;

public class Circle extends Shape {

    @Override
    public void dragTodraw() {
        System.out.println("◯");
    }


    public void printCircleInfo(){
        System.out.println("I am an object of type Circle");
    }

}
