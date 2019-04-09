package design.patterns.creationals.factory_method.abstract_creator;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Print a Circle");
    }
}
