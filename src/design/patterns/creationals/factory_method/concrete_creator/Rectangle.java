package design.patterns.creationals.factory_method.concrete_creator;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("print rectangle");
    }
}
