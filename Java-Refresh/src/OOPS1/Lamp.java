package OOPS1;

public class Lamp {
    boolean isOn;
    void turnOn(){
        isOn=true;
        System.out.println("Lamp turned on");
    }
    void turnOff(){
        isOn=false;
        System.out.println("Lamp turned off");
    }
}
