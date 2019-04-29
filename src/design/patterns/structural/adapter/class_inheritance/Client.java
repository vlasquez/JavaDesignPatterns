package design.patterns.structural.adapter.class_inheritance;

import design.patterns.structural.adapter.class_inheritance.duck.Duck;
import design.patterns.structural.adapter.class_inheritance.duck.MallardDuck;
import design.patterns.structural.adapter.class_inheritance.turkey.WildTurkey;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/
public class Client {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
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
