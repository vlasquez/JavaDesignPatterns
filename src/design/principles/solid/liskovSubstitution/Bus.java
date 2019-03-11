package design.principles.solid.liskovSubstitution;

public class Bus extends Vehicle {

    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    String getEmergency(){
        return "";
    }
}
