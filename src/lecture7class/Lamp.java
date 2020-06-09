package lecture7class;

public class Lamp {

    // === Fields  ==== //
    String isLampCurrentlyOn;


    // === Constructor ==== //
    public Lamp(String state) {
        isLampCurrentlyOn = state;
    }

    // === Behavior (methods) === /
    public void turnOn() {
        //System.out.println("Turning on lamp for you!");
        isLampCurrentlyOn = "true";
    }

    public void turnOff() {
        System.out.println("Turning off the lamp for you!");
        isLampCurrentlyOn = "false";
    }
}
