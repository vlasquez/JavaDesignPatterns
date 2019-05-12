package design.patterns.structural.adapter.object_implementation.example_1.turkey;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
