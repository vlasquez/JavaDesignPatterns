package design.patterns.creationals.abstract_factory.example.shapes;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Printing Shapes");
    }
}
