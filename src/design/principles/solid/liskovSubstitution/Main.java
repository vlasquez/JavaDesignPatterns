package design.principles.solid.liskovSubstitution;

public class Main {

    public static void main(String[] args){
        /** Liskov Principle demostration **/

        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car();
        ((Car) vehicle).sHatchBack();
    }

}
