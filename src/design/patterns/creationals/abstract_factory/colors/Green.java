package design.patterns.creationals.abstract_factory.colors;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Fill green color");
    }
}
