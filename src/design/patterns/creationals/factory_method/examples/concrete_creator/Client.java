package design.patterns.creationals.factory_method.examples.concrete_creator;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        rectangle.draw();
    }
}
