package design.principles.solid.liskovSubstitution;

public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }
    boolean sHatchBack(){
        return true;
    }
}
