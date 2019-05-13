package design.patterns.structural.bridge.example;

public class Client {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assembly());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assembly());
        vehicle2.manufacture();

    }
}
