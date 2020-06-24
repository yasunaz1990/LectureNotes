package lecture9_polymorphisim_runtime;

public class Paint {

    public static void main(String[] args) {

        // Shape object
        Circle cir = new Circle();
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();


        Shape[] shapeSection = {cir, rec, tri};

        // for-each
        for(Shape s : shapeSection) {
            if(s instanceof Circle){
               Circle c = (Circle)s;
               ((Circle) s).printCircleInfo();  // example
            }
            s.dragTodraw();
        }


    }
}
