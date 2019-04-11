package design.patterns.creationals.abstract_factory.shapes;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Printing Rectangle");
    }
}
