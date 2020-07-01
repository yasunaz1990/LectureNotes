package lecture11_static.inheritance;

public class Child extends Parent {

    static public int number = 12;

    // @Override  <-- only for non-static
    // This is called Method Hiding
    static public void hello(){
        System.out.println("Hello there from Children");
    }


    static public void parentHello(){
      //  super.hello();  won't work
        Parent.hello();   // use this
    }
}
