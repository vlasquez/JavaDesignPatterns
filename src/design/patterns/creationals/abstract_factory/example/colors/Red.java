package design.patterns.creationals.abstract_factory.example.colors;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill red color");
    }
}
