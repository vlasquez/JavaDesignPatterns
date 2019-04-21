package design.patterns.creationals.prototype.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        CarCached.loadCache();

        BasicCar car = CarCached.getCar("Renault");
        System.out.println("Car is :" + car.getModelName() + "with price: " + car.getPrice());

        BasicCar car1 = CarCached.getCar("Ford");
        System.out.println("Car is :" + car1.getModelName() + "with price: " + car1.getPrice());
    }
}
