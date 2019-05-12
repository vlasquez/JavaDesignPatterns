package design.patterns.structural.adapter.object_implementation.example_1;

import design.patterns.structural.adapter.object_implementation.example_1.duck.Duck;
import design.patterns.structural.adapter.object_implementation.example_1.duck.MallardDuck;
import design.patterns.structural.adapter.object_implementation.example_1.turkey.Turkey;
import design.patterns.structural.adapter.object_implementation.example_1.turkey.WildTurkey;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/
public class Client {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe duck/turkey says");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

}
