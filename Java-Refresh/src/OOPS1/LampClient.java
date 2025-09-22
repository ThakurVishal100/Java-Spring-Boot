package OOPS1;

public class LampClient {
    public static void main(String[] args) {
        Lamp lamp=new Lamp();
        System.out.println(lamp.isOn);
        lamp.turnOn();
        System.out.println(lamp.isOn);
    }
}
