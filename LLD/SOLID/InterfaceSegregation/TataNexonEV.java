package SOLID.InterfaceSegregation;

public class TataNexonEV implements CarParts, EVEngine {
    public void brake() {
        System.out.println("TataNexonEV is braking");
    }
    public void accelerate() {
        System.out.println("TataNexonEV is accelerating");
    }
    public void steering() {
        System.out.println("TataNexonEV is steering");
    }
    public void evEngine() {
        System.out.println("TataNexonEV is using EV engine");
    }
}
