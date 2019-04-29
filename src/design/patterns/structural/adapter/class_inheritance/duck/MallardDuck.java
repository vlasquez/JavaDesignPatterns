package design.patterns.structural.adapter.object_composition.duck;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
