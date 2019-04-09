package design.patterns.creationals.factory_method.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class Duck implements Animal {
    @Override
    public void walk(int x) {
        System.out.println("The duck walks " + x + " steps");
    }
}
