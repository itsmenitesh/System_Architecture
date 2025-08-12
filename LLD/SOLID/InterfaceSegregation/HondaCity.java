package SOLID.InterfaceSegregation;

public class HondaCity implements CarParts, ManualGear, NonEVEngine {
    public void brake() {
        System.out.println("HondaCity is braking");
    }
    public void accelerate() {
        System.out.println("HondaCity is accelerating");
    }
    public void steering() {
        System.out.println("HondaCity is steering");
    }
    public void manualGear() {
        System.out.println("HondaCity is using manual gear");
    }
    public void nonEVEngine() {
        System.out.println("HondaCity is using non-EV engine");
    }
}
