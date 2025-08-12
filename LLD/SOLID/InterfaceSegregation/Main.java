package SOLID.InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        CarParts carParts = new HondaCity();
        carParts.brake();
        carParts.accelerate();
        carParts.steering();
        ManualGear manualGear = new HondaCity();
        manualGear.manualGear();
        NonEVEngine nonEVEngine = new HondaCity();
    }
}
