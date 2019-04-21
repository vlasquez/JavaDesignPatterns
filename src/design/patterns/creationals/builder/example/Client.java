package design.patterns.creationals.builder.example;

import design.patterns.creationals.builder.example.client.Car;
import design.patterns.creationals.builder.example.client.MotorCycle;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Client {

    public static void main(String[] args) {
        Director director = new Director();


        // Making a car
        Builder carBuilder = new Car();
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        // Making a motorcycle

        Builder motorCycleBuilder = new MotorCycle();
        director.construct(motorCycleBuilder);
        Product p2 = motorCycleBuilder.getVehicle();
        p2.show();
    }

}
