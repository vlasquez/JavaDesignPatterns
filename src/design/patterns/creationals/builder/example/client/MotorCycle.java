package design.patterns.creationals.builder.example.client;

import design.patterns.creationals.builder.example.Builder;
import design.patterns.creationals.builder.example.Product;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class MotorCycle implements Builder {
    Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlight is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
