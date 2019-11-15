package design.patterns.creationals.prototype.challenge;

import java.util.Random;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class BasicCar implements Cloneable {

    public int price;
    protected String modelName;

    public String getModelName() {
        return modelName;
    }

    public float getPrice() {
        return price;
    }

    public static int setPrice() {
        int price;
        Random r = new Random();
        price = r.nextInt(10);
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
