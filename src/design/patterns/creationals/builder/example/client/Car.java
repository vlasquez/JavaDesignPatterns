package design.patterns.creationals.builder.example.client;

import design.patterns.creationals.builder.example.Builder;
import design.patterns.creationals.builder.example.Product;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Car implements Builder {

    private Product product = new Product();

    @Override
    public void buildBody() {

        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
