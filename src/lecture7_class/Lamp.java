package lecture7_class;

public class Lamp {

    // === Fields  ==== //
    // relevant data for Lamp
    String isLampCurrentlyOn;


    // === Constructor ==== //
    // special method that takes care of object
    // creation, note that constructor is not
    // part of an object.
    public Lamp(String state) {
        isLampCurrentlyOn = state;
    }

    // === Behavior (methods) === /
    // capability of methods, what it can do
    // two types exist:
    // 1. Mutator, method that if ran, alters the current value of fields
    // 2. Performer of some specialized tasks

    public void turnOn() {
        //System.out.println("Turning on lamp for you!");
        isLampCurrentlyOn = "true";
    }

    public void turnOff() {
        System.out.println("Turning off the lamp for you!");
        isLampCurrentlyOn = "false";
    }
}
