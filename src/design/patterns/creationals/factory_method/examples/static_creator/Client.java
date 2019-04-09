package design.patterns.creationals.factory_method.examples.concrete_creator.static_creator;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class Client {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
