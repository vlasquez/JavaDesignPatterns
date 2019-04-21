package design.patterns.creationals.prototype.challenge.car;

import design.patterns.creationals.prototype.challenge.BasicCar;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class Ford  extends BasicCar {

    public Ford(String model) {
        modelName = model;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
