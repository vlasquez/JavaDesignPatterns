package design.patterns.creationals.factory_method.examples.concrete_creator.abstract_creator;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class Client {

    public static void main(String[] args) {
        // get an object of Circle and call its draw method

        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();
    }
}
