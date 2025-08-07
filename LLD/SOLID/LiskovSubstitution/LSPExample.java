package SOLID.LiskovSubstitution;

class BaseBird {
    public void walk() {
        System.out.println("Bird can walk");
    }
}

class Bird extends BaseBird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void swim() {
        System.out.println("Bird can swim");
    }
}

class Duck extends Bird {
    public void fly() {
        System.out.println("Duck can fly");
    }
    public void swim() {
        System.out.println("Duck can swim");
    }
    public void walk() {
        System.out.println("Duck can walk");
    }
}

class Crow extends Bird {
    public void fly() {
        System.out.println("Crow can fly");
    }
    public void walk() {
        System.out.println("Crow can walk");
    }
    // Note: Crow doesn't override swim(), so it inherits the default swim() behavior
    // This is better than throwing an exception - it just doesn't swim well
}

public class LSPExample {
    public static void main(String[] args) {
        // Test LSP compliance
        Bird[] birds = {new Bird(), new Duck(), new Crow()};
        
        for (Bird bird : birds) {
            System.out.println("Testing " + bird.getClass().getSimpleName() + ":");
            bird.walk();
            bird.fly();
            bird.swim(); // This won't throw an exception for any bird type
            System.out.println();
        }
    }
}
